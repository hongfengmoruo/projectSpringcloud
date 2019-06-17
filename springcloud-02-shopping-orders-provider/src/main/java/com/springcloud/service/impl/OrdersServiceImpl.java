package com.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springcloud.common.PageUtils;
import com.springcloud.dao.OrdersMapper;
import com.springcloud.entity.Orders;
import com.springcloud.service.OrdersService;
/**
 * 订单模块模型层的实现类，用于实现订单模块的方法
 * 
 * @author WM
 *
 */
@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersMapper ordersMapper;
	
	@Override
	public PageInfo<Orders> selectOrders(Orders orders, Integer pageNumber) {
		if (orders.getUser() != null) {
			orders.getUser().setUserName("%" + orders.getUser().getUserName() + "%");
		}
		
		// 设置每页的订单信息
		PageHelper.startPage(pageNumber + 1, PageUtils.PAGE_ROW_COUNT);
		// 查询满足条件的订单信息
		List<Orders> list = this.ordersMapper.selectOrders(orders);
		return new PageInfo<>(list);
	}

	@Transactional
	@Override
	public Integer updateStatusByOrderId(Orders orders) {
		
		return this.ordersMapper.updateOrdersStatus(orders);
	}

	@Override
	public List<Orders> selectGroup(Orders orders) {
		return this.ordersMapper.selectGroup(orders);
	}


}
