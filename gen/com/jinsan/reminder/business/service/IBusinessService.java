package com.jinsan.reminder.business.service;

import java.util.List;

import com.jinsan.reminder.business.model.BusinessBean;

/**
 * IBusinessService :(描述)<br/>
 * date: 2019年01月02日 10:49:21<br/>
 * @source generate create
 * @author gaochengcheng
 */
public interface IBusinessService{

	/**
	 * insertBusiness:(描述). <br/>
	 * 
	 * @author gaochengcheng
	 * @date 2019年01月02日 10:49:21
	 * @param bean
	 * @return int
	 */
	public int insertBusiness(BusinessBean bean);

	/**
	 * updateBusiness:(描述). <br/>
	 * 
	 * @author gaochengcheng
	 * @date 2019年01月02日 10:49:21
	 * @param bean
	 * @return int
	 */
	public int updateBusiness(BusinessBean bean);
	
	/**
	 * deleteBusiness:(描述). <br/>
	 * 
	 * @author gaochengcheng
	 * @date 2019年01月02日 10:49:21
	 * @param bean
	 * @return int
	 */
	public int deleteBusiness(Long id);
	
	/**
	 * 
	 * getBusinessById:根据主键查询唯一记录. <br/>
	 * @author gaochengcheng BusinessBean
	 * @param businessBean
	 * @date 2019年01月02日 10:49:21<br/>
	 * @return void
	 */
	public BusinessBean getBusinessById(Long id);

}
