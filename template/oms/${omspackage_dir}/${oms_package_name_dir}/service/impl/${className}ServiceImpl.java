<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${omspackage}.${oms_package_name}.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ${omspackage}.${oms_package_name}.service.I${className}Service;
import ${omspackage}.${oms_package_name}.dao.I${className}Dao;
import ${omspackage}.${oms_package_name}.model.${className}Bean;
/**
 * ${className}ServiceImpl :(描述)<br/>
 * date: ${.now?string("yyyy年MM月dd日 HH:mm:ss")}<br/>
 * @source ${omssource}
 * @author ${username}
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ${className}ServiceImpl implements I${className}Service{

    @Autowired
    I${className}Dao ${classNameLower}Dao;
    
	/**
	 * insert${className}:(描述). <br/>
	 * 
	 * @author ${username}
	 * @date ${.now?string("yyyy年MM月dd日 HH:mm:ss")}
	 * @param bean
	 * @return int
	 */
	public int insert${className}(${className}Bean bean){
		return ${classNameLower}Dao.insert${className}(bean);
	}

	/**
	 * update${className}:(描述). <br/>
	 * 
	 * @author ${username}
	 * @date ${.now?string("yyyy年MM月dd日 HH:mm:ss")}
	 * @param bean
	 * @return int
	 */
	public int update${className}(${className}Bean bean){
		return ${classNameLower}Dao.update${className}(bean);
	}
	
	/**
	 * delete${className}:(描述). <br/>
	 * 
	 * @author ${username}
	 * @date ${.now?string("yyyy年MM月dd日 HH:mm:ss")}
	 * @param bean
	 * @return int
	 */
	public int delete${className}(Long id){
		return ${classNameLower}Dao.delete${className}(id);
	}
	
	/**
	 * 
	 * get${className}ById:根据主键查询唯一记录. <br/>
	 * @author gaochengcheng ${className}Bean
	 * @param ${classNameLower}Bean
	 * @date ${.now?string("yyyy年MM月dd日 HH:mm:ss")}<br/>
	 * @return void
	 */
	public ${className}Bean get${className}ById(Long id){
		return  ${classNameLower}Dao.get${className}ById(id);
	}
}
