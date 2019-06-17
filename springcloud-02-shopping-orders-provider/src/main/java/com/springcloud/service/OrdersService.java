package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Orders;

/**
 * ����ģ��ģ�Ͳ�Ľӿڣ����ڶ��嶩��ģ�͵ķ���
 * 
 * @author WM
 *
 */
public interface OrdersService {

	/**
	 * ��ѯ���������Ķ�����Ϣ����ҳ���ܣ�
	 * @param orders	��ѯ����
	 * @return			����com.github.pagehelper.PageInfo���͵�ʵ��
	 */
	public abstract PageInfo<Orders> selectOrders(Orders orders,Integer pageNumber);
	
	/**
	 * @param orderId
	 * @return
	 */
	public abstract Integer updateStatusByOrderId(Orders orders);
	
	public abstract List<Orders> selectGroup(Orders orders);
}
