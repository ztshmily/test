package com.jinsan.reminder.business.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.jinsan.reminder.business.model.BusinessBean;

/**
 * IBusinessDao :(描述)<br/>
 * date: 2019年01月02日 10:49:21<br/>
 * @source generate create
 * @author gaochengcheng
 */
public interface IBusinessDao{
	
	/**
	 * 
	 * insert:插入记录. <br/>
	 * @author gaochengcheng BusinessBean
	 * @param businessBean
	 * @date 2019年01月02日 10:49:21<br/>
	 * @return void
	 */
	int insertBusiness(BusinessBean businessBean);
	
	/**
	 * 
	 * update:修改记录. <br/>
	 * @author gaochengcheng BusinessBean
	 * @param businessBean
	 * @date 2019年01月02日 10:49:21<br/>
	 * @return void
	 */
	int updateBusiness(BusinessBean businessBean);
	
	/**
	 * 
	 * deleteBusiness:删除记录. <br/>
	 * @author gaochengcheng BusinessBean
	 * @param businessBean
	 * @date 2019年01月02日 10:49:21<br/>
	 * @return void
	 */
	int deleteBusiness(@Param("id") Long id);
	
	/**
	 * 
	 * getBusinessById:根据主键查询唯一记录. <br/>
	 * @author gaochengcheng BusinessBean
	 * @param businessBean
	 * @date 2019年01月02日 10:49:21<br/>
	 * @return void
	 */
	BusinessBean getBusinessById(@Param("id") Long id);


}
