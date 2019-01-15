<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${omspackage}.${oms_package_name}.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ${omspackage}.${oms_package_name}.model.${className}Bean;

/**
 * I${className}Dao :(描述)<br/>
 * date: ${.now?string("yyyy年MM月dd日 HH:mm:ss")}<br/>
 * @source ${omssource}
 * @author ${username}
 */
public interface I${className}Dao{
	
	/**
	 * 
	 * insert:插入记录. <br/>
	 * @author gaochengcheng ${className}Bean
	 * @param ${classNameLower}Bean
	 * @date ${.now?string("yyyy年MM月dd日 HH:mm:ss")}<br/>
	 * @return void
	 */
	int insert${className}(${className}Bean ${classNameLower}Bean);
	
	/**
	 * 
	 * update:修改记录. <br/>
	 * @author gaochengcheng ${className}Bean
	 * @param ${classNameLower}Bean
	 * @date ${.now?string("yyyy年MM月dd日 HH:mm:ss")}<br/>
	 * @return void
	 */
	int update${className}(${className}Bean ${classNameLower}Bean);
	
	/**
	 * 
	 * delete${className}:删除记录. <br/>
	 * @author gaochengcheng ${className}Bean
	 * @param ${classNameLower}Bean
	 * @date ${.now?string("yyyy年MM月dd日 HH:mm:ss")}<br/>
	 * @return void
	 */
	int delete${className}(@Param("id") Long id);
	
	/**
	 * 
	 * get${className}ById:根据主键查询唯一记录. <br/>
	 * @author gaochengcheng ${className}Bean
	 * @param ${classNameLower}Bean
	 * @date ${.now?string("yyyy年MM月dd日 HH:mm:ss")}<br/>
	 * @return void
	 */
	${className}Bean get${className}ById(@Param("id") Long id);


}
