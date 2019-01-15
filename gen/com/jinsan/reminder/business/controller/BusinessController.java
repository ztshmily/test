package com.jinsan.reminder.business.controller;

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
import com.jinsan.reminder.business.model.BusinessBean;
import com.jinsan.reminder.business.service.IBusinessService;

/**
 * BusinessController :(描述)<br/>
 * date: 2019年01月02日 10:49:21<br/>
 * @source generate create
 * @author gaochengcheng
 */
@RestController
@EnableWebMvc
@RequestMapping("/business")
public class BusinessController {
  
    @Autowired
    IBusinessService businessService;
	
//    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE })
//    public ResultMsg<Integer> addBusiness(BusinessBean bean, WebRequest request) {
//        ResultMsg<Integer> result = new ResultMsg<Integer>();
//        try {
//	        //TODO 数据合法性校验
//        	
//        	//根据业务设置失败原因
//	        result.setCode(ResultMsg.SYSTEM_ERROR);
//	        
//	        //调用数据插入的业务方法
//	        Integer opResult = businessService.insertBusiness(bean);
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
//    public ResultMsg<Integer> updateBusiness(BusinessBean bean, WebRequest request) {
//        ResultMsg<Integer> result = new ResultMsg<Integer>();
//        
//        try {
//	        //TODO 数据合法性校验
//	        
//	        //根据业务设置失败原因
//	        result.setCode(ResultMsg.SYSTEM_ERROR);
//	        
//	        //调用数据插入的业务方法
//	        Integer opResult = businessService.updateBusiness(bean);
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
//   	public ResultMsg<Integer> deleteBusiness(HttpServletRequest request, HttpServletResponse response,
//   			@PathVariable("id") Long id) {
//   		ResultMsg<Integer> result = new ResultMsg<Integer>();
//   		try {
//   	        //TODO 数据合法性校验
//   	        
//   	        //根据业务设置失败原因
//	        result.setCode(ResultMsg.SYSTEM_ERROR);
//   	        
//   	        //调用数据插入的业务方法
//   	        Integer opResult = businessService.deleteBusiness(id);
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
//	public ResultMsg<BusinessBean> getBusiness(HttpServletRequest request, HttpServletResponse response,
//			@PathVariable("id") Long id) {
//		ResultMsg<BusinessBean> result = new ResultMsg<BusinessBean>();
//		try {
//   	        //TODO 数据合法性校验
//			
//			 //根据业务设置失败原因
//   	        result.setCode(ResultMsg.SYSTEM_ERROR);
//   	        
//   	        //调用数据插入的业务方法
//   	        BusinessBean bean = businessService.getBusinessById(id);
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
//	public ResultMsg<Page<BusinessBean>> findBusinessPage(BusinessBean bean, WebRequest request) {
//		ResultMsg<Page<BusinessBean>> result = new ResultMsg<Page<BusinessBean>>();
//		try {
//   	        //TODO 数据合法性校验
//			
//			//根据业务设置失败原因
//   	        result.setCode(ResultMsg.SYSTEM_ERROR);
//   	        
//	    	Page<BusinessBean> page = new Page<BusinessBean>(PageUtil.PAGE_SIZE).init(request);
//	    	businessService.findBusinessPage(bean, page);
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
