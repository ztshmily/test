<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameReplace = className>   
<#assign classNameLower = className?uncap_first> 
package ${asopackage}.controller;

/**
 * ${className}Controller :(描述)<br/>
 * date: ${.now?string("yyyy年MM月dd日 HH:mm:ss")}<br/>
 * @source ${omssource}
 * @author ${username}
 */
@RestController
@RequestMapping("/${classNameLower}")
public class ${className}Controller extends HtcheController{
  
    @Autowired
    I${className}Service ${classNameLower}Service;
	
	 
    @AsoLogger(infostart = "新增")
    @RequestMapping(value = "/add${className}", method = RequestMethod.POST, produces = {
            MediaType.APPLICATION_JSON_VALUE })
    public ResultMsg<Object> add${className}() {
        ResultMsg<Object> reslutMsg = new ResultMsg<>();
        //TODO 具体的操作
        reslutMsg.setCode(ResultMsg.SUCCESS);
        reslutMsg.setMessage(list);
        return reslutMsg;
    }
}
