package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Orders;

/**
 * 订单模块模型层的接口，用于定义订单模型的方法
 * 
 * @author WM
 *
 */
public interface OrdersService {

	/**
	 * 查询满足条件的订单信息（分页功能）
	 * @param orders	查询条件
	 * @return			返回com.github.pagehelper.PageInfo类型的实例
	 */
	public abstract PageInfo<Orders> selectOrders(Orders orders,Integer pageNumber);
	
	/**
	 * @param orderId
	 * @return
	 */
	public abstract Integer updateStatusByOrderId(Orders orders);
	
	public abstract List<Orders> selectGroup(Orders orders);
}
