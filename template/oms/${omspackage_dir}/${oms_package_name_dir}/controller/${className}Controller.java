<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${omspackage}.${oms_package_name}.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import ${omspackage}.${oms_package_name}.model.${className}Bean;
import ${omspackage}.${oms_package_name}.service.I${className}Service;

/**
 * ${className}Controller :(描述)<br/>
 * date: ${.now?string("yyyy年MM月dd日 HH:mm:ss")}<br/>
 * @source ${omssource}
 * @author ${username}
 */
@RestController
@EnableWebMvc
@RequestMapping("/${classNameLower}")
public class ${className}Controller {
  
    @Autowired
    I${className}Service ${classNameLower}Service;
	
//    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE })
//    public ResultMsg<Integer> add${className}(${className}Bean bean, WebRequest request) {
//        ResultMsg<Integer> result = new ResultMsg<Integer>();
//        try {
//	        //TODO 数据合法性校验
//        	
//        	//根据业务设置失败原因
//	        result.setCode(ResultMsg.SYSTEM_ERROR);
//	        
//	        //调用数据插入的业务方法
//	        Integer opResult = ${classNameLower}Service.insert${className}(bean);
//	        
//	        //设置成功及返回结果
//	        result.setResult(ResultMsg.SUCCESS, opResult);
//	        return result;
//        }
//        catch (Exception e) {
//   			logger.error("查询XX数据失败!", e);
//   			result.setResultError(ResultMsg.BIZ_ERROR, "查询XX数据失败");
//   		}
//   		return result;
//    }
//    
//    @RequestMapping(value = "/modify", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE })
//    public ResultMsg<Integer> update${className}(${className}Bean bean, WebRequest request) {
//        ResultMsg<Integer> result = new ResultMsg<Integer>();
//        
//        try {
//	        //TODO 数据合法性校验
//	        
//	        //根据业务设置失败原因
//	        result.setCode(ResultMsg.SYSTEM_ERROR);
//	        
//	        //调用数据插入的业务方法
//	        Integer opResult = ${classNameLower}Service.update${className}(bean);
//	        
//	        //设置成功及返回结果
//	        result.setResult(ResultMsg.SUCCESS, opResult);
//	        return result;
//        }
//        catch (Exception e) {
//   			logger.error("查询XX数据失败!", e);
//   			result.setResultError(ResultMsg.BIZ_ERROR, "查询XX数据失败");
//   		}
//   		return result;
//    }
//    
//    @RequestMapping(value = "/del/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//   	public ResultMsg<Integer> delete${className}(HttpServletRequest request, HttpServletResponse response,
//   			@PathVariable("id") Long id) {
//   		ResultMsg<Integer> result = new ResultMsg<Integer>();
//   		try {
//   	        //TODO 数据合法性校验
//   	        
//   	        //根据业务设置失败原因
//	        result.setCode(ResultMsg.SYSTEM_ERROR);
//   	        
//   	        //调用数据插入的业务方法
//   	        Integer opResult = ${classNameLower}Service.delete${className}(id);
//   	        
//   	        //设置成功及返回结果
//   	        result.setResult(ResultMsg.SUCCESS, opResult);
//   	        return result;
//   		}
//   		catch (Exception e) {
//   			logger.error("查询XX数据失败!", e);
//   			result.setResultError(ResultMsg.BIZ_ERROR, "查询XX数据失败");
//   		}
//   		return result;
//   	}
//    
//    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResultMsg<${className}Bean> get${className}(HttpServletRequest request, HttpServletResponse response,
//			@PathVariable("id") Long id) {
//		ResultMsg<${className}Bean> result = new ResultMsg<${className}Bean>();
//		try {
//   	        //TODO 数据合法性校验
//			
//			 //根据业务设置失败原因
//   	        result.setCode(ResultMsg.SYSTEM_ERROR);
//   	        
//   	        //调用数据插入的业务方法
//   	        ${className}Bean bean = ${classNameLower}Service.get${className}ById(id);
//   	        
//   	        //设置成功及返回结果
//   	        result.setResult(ResultMsg.SUCCESS, bean);
//   	        return result;
//		}
//		catch (Exception e) {
//			logger.error("查询XX数据失败!", e);
//			result.setResultError(ResultMsg.BIZ_ERROR, "查询XX数据失败");
//		}
//		return result;
//	}
//    
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//	@ResponseBody
//	public ResultMsg<Page<${className}Bean>> find${className}Page(${className}Bean bean, WebRequest request) {
//		ResultMsg<Page<${className}Bean>> result = new ResultMsg<Page<${className}Bean>>();
//		try {
//   	        //TODO 数据合法性校验
//			
//			//根据业务设置失败原因
//   	        result.setCode(ResultMsg.SYSTEM_ERROR);
//   	        
//	    	Page<${className}Bean> page = new Page<${className}Bean>(PageUtil.PAGE_SIZE).init(request);
//	    	${classNameLower}Service.find${className}Page(bean, page);
//
//	    	//设置成功及返回结果
//   	        result.setResult(ResultMsg.SUCCESS, page);
//   	        return result;
//		
//		}
//		catch (Exception e) {
//			logger.error("查询XX数据失败!", e);
//			result.setResultError(ResultMsg.BIZ_ERROR, "查询XX数据失败");
//		}
//		return result;
//	}
}
