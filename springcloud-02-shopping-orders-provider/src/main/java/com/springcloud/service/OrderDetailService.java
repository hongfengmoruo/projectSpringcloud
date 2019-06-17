package com.springcloud.service;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.OrderDetail;

/**
 * 订单明细模块模型层的接口，用户定义订单明细模块的方法
 * 
 * @author WM
 *
 */
public interface OrderDetailService {

	/**
	 * 查询指定订单编号的订单明细信息（分页功能）
	 * @param orderId		订单Id
	 * @param pageNumber	页数
	 * @return				返回com.github.pagehelper.PageInfo类型的实例
	 */
	public abstract PageInfo<OrderDetail> selectByOrderId(Integer orderId,Integer pageNumber);
	
	
}
