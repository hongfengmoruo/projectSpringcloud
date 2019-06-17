package com.springcloud.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.springcloud.common.PageUtils;
import com.springcloud.entity.Orders;
import com.springcloud.service.OrdersService;
import com.springcloud.vo.ResultValue;

@RestController
@RequestMapping("orders")
public class OrdersController {
	@Autowired
	private OrdersService ordersService;

	/**
	 * 查询满足条件的订单信息
	 * @param orders		查询条件
	 * @param pageNumber	页数
	 * @return
	 */
	@RequestMapping(value = "/selectOrders")
	public ResultValue selectOrders(Orders orders, @RequestParam("pageNumber") Integer pageNumber) {
		ResultValue rv = new ResultValue();
		try {
			PageInfo<Orders> selectOrders = this.ordersService.selectOrders(orders, pageNumber);
			List<Orders> list = selectOrders.getList();
			if (list != null && list.size() > 0) {
				rv.setCode(0);
				Map<String, Object> map = new HashMap<>();
				map.put("ordersList", list);
				
				PageUtils pageUtils = new PageUtils(selectOrders.getPages()*PageUtils.PAGE_ROW_COUNT);
				pageUtils.setPageNumber(pageNumber);
				map.put("pageUtils",pageUtils);
				
				rv.setDataMap(map);
				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMassage("没有找到满足条件的商品订单信息！！");
		return rv;

	}
	
	/**
	 * 修改指定编号订单的订单状态
	 * @param orders	修改的订单数据
	 * @return
	 */
	@RequestMapping(value="/updateOrdersStatus")
	public ResultValue updateOrdersStatus(Orders orders) {
		ResultValue rv = new ResultValue();
	 try {
		Integer updateStatusByOrderId = this.ordersService.updateStatusByOrderId(orders);
		if (updateStatusByOrderId != 0) {
			rv.setCode(0);
			rv.setMassage("修改信息成功！！");
			return rv;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	 	rv.setCode(1);
	 	rv.setMassage("修改信息失败！！");
		return rv;
		
	}
	
	@RequestMapping(value="/selectGroup")
	public ResultValue selectGroup(Orders orders) {
		ResultValue rv = new ResultValue();
		try {
			List<Orders> selectGroup = this.ordersService.selectGroup(orders);
			if(selectGroup != null && selectGroup.size() > 0) {
				rv.setCode(0);
				List<String> x = new ArrayList<>();
				List<Double> y = new ArrayList<>();
				
				for (Orders o : selectGroup) {
					x.add(o.getOrderMonth());
					y.add(o.getOrderPrice());
				}
				
				HashMap<String, Object> map = new HashMap<>();
				map.put("x", x);
				map.put("y", y);
				rv.setDataMap(map);
				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		return rv;
	}
}
