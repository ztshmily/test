package com.jinsan.reminder.business.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.jinsan.reminder.business.service.IBusinessService;
import com.jinsan.reminder.business.dao.IBusinessDao;
import com.jinsan.reminder.business.model.BusinessBean;
/**
 * BusinessServiceImpl :(描述)<br/>
 * date: 2019年01月02日 10:49:21<br/>
 * @source generate create
 * @author gaochengcheng
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class BusinessServiceImpl implements IBusinessService{

    @Autowired
    IBusinessDao businessDao;
    
	/**
	 * insertBusiness:(描述). <br/>
	 * 
	 * @author gaochengcheng
	 * @date 2019年01月02日 10:49:21
	 * @param bean
	 * @return int
	 */
	public int insertBusiness(BusinessBean bean){
		return businessDao.insertBusiness(bean);
	}

	/**
	 * updateBusiness:(描述). <br/>
	 * 
	 * @author gaochengcheng
	 * @date 2019年01月02日 10:49:21
	 * @param bean
	 * @return int
	 */
	public int updateBusiness(BusinessBean bean){
		return businessDao.updateBusiness(bean);
	}
	
	/**
	 * deleteBusiness:(描述). <br/>
	 * 
	 * @author gaochengcheng
	 * @date 2019年01月02日 10:49:21
	 * @param bean
	 * @return int
	 */
	public int deleteBusiness(Long id){
		return businessDao.deleteBusiness(id);
	}
	
	/**
	 * 
	 * getBusinessById:根据主键查询唯一记录. <br/>
	 * @author gaochengcheng BusinessBean
	 * @param businessBean
	 * @date 2019年01月02日 10:49:21<br/>
	 * @return void
	 */
	public BusinessBean getBusinessById(Long id){
		return  businessDao.getBusinessById(id);
	}
}
