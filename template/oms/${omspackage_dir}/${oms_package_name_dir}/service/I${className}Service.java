<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${omspackage}.${oms_package_name}.service;

import java.util.List;

import ${omspackage}.${oms_package_name}.model.${className}Bean;

/**
 * I${className}Service :(描述)<br/>
 * date: ${.now?string("yyyy年MM月dd日 HH:mm:ss")}<br/>
 * @source ${omssource}
 * @author ${username}
 */
public interface I${className}Service{

	/**
	 * insert${className}:(描述). <br/>
	 * 
	 * @author ${username}
	 * @date ${.now?string("yyyy年MM月dd日 HH:mm:ss")}
	 * @param bean
	 * @return int
	 */
	public int insert${className}(${className}Bean bean);

	/**
	 * update${className}:(描述). <br/>
	 * 
	 * @author ${username}
	 * @date ${.now?string("yyyy年MM月dd日 HH:mm:ss")}
	 * @param bean
	 * @return int
	 */
	public int update${className}(${className}Bean bean);
	
	/**
	 * delete${className}:(描述). <br/>
	 * 
	 * @author ${username}
	 * @date ${.now?string("yyyy年MM月dd日 HH:mm:ss")}
	 * @param bean
	 * @return int
	 */
	public int delete${className}(Long id);
	
	/**
	 * 
	 * get${className}ById:根据主键查询唯一记录. <br/>
	 * @author gaochengcheng ${className}Bean
	 * @param ${classNameLower}Bean
	 * @date ${.now?string("yyyy年MM月dd日 HH:mm:ss")}<br/>
	 * @return void
	 */
	public ${className}Bean get${className}ById(Long id);

}
