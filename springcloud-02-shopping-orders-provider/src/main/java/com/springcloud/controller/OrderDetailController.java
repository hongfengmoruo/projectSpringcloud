package com.springcloud.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.springcloud.common.PageUtils;
import com.springcloud.entity.OrderDetail;
import com.springcloud.service.OrderDetailService;
import com.springcloud.vo.ResultValue;

@RestController
@RequestMapping("orderDetail")
public class OrderDetailController {

	@Autowired 
	private OrderDetailService orderDetailService;
	
	@RequestMapping(value="/selectByOrderId")
	public ResultValue selectByOrderId(@RequestParam("orderId") Integer orderId,@RequestParam("pageNumber") Integer pageNumber) {
		ResultValue rv = new ResultValue();
		try {
			PageInfo<OrderDetail> selectByOrderId = this.orderDetailService.selectByOrderId(orderId, pageNumber);
			List<OrderDetail> list = selectByOrderId.getList();
			if (list != null && list.size() > 0) {
				rv.setCode(0);
				HashMap<String, Object> map = new HashMap<>();
				map.put("orderDetailList", list);
				PageUtils pUtils = new PageUtils(5,selectByOrderId.getPages()*5);
				pUtils.setPageNumber(pageNumber);
				map.put("pageUtils", pUtils);
				
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
}
