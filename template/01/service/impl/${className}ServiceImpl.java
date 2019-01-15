<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${asopackage}.service.impl;

import ${asopackage}.service.I${className}Service;
/**
 * ${className}ServiceImpl :(描述)<br/>
 * date: ${.now?string("yyyy年MM月dd日 HH:mm:ss")}<br/>
 * @source ${omssource}
 * @author ${username}
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ${className}ServiceImpl extends BaseServiceImpl implements I${className}Service{

    @Autowired
    ${className}Dao ${classNameLower}Dao;
	
	/**
	 * query${className}BeanById:(描述). <br/>
	 * 
	 * @author ${username}
	 * @date ${.now?string("yyyy年MM月dd日 HH:mm:ss")}
	 * @param bean
	 * @return List<${className}Bean>
	 */
	public List<${className}Bean> query${className}ById(${className}Bean bean);

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
	 * delete${className}:(描述). <br/>
	 * 
	 * @author ${username}
	 * @date ${.now?string("yyyy年MM月dd日 HH:mm:ss")}
	 * @param bean
	 * @return int
	 */
	public int delete${className}(${className}Bean bean);
}
