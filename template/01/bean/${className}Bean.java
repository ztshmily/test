<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
<#assign haveTime=false>
<#assign haveDecimal=false>
package ${asopackage}.common.model;

import com.htche.aso.common.util.page.BasePage;
<#list table.columns as column>
	<#if column.isDateTimeColumn>
	     <#assign haveTime=true>
	</#if>
	<#if column.decimalDigitsGtZero>
	     <#assign haveDecimal=true>
	</#if>
</#list>
<#if haveTime>
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
</#if>
<#if haveDecimal>
import java.math.BigDecimal;
</#if>
/**
 * ${className}Bean :(描述)<br/>
 * date: ${.now?string("yyyy年MM月dd日 HH:mm:ss")}<br/>
 * @source ${omssource}
 * @author ${username}
 */
public class ${className}Bean extends BasePage<${className}Bean>{
	
	<#list table.columns as column>
	/**
	 * ${column.columnAlias}
	 */
	<#if column.isDateTimeColumn>
	  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8") 
	  @DateTimeFormat(pattern = "yyyy-MM-dd") 
	</#if>
	private ${column.simpleJavaType} ${column.columnNameTrimPrefix};
	</#list>
	
	 <@generateJavaColumns/>
	<#macro generateJavaColumns>
	<#list table.columns as column>
		<#if column.isDateTimeColumn>
	public String get${column.columnName}String() {
		return DateConvertUtils.format(get${column.columnName}(), FORMAT_${column.constantName});
	}
	public void set${column.columnName}String(String value) {
		set${column.columnName}(DateConvertUtils.parse(value, FORMAT_${column.constantName},${column.simpleJavaType}.class));
	}
	
		</#if>	
	public void set${column.columnName}(${column.simpleJavaType} value) {
		this.${column.columnNameLower} = value;
	}
	
	public ${column.simpleJavaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	</#list>
	</#macro>
}
