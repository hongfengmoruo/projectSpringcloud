package com.springcloud.service;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.OrderDetail;

/**
 * ������ϸģ��ģ�Ͳ�Ľӿڣ��û����嶩����ϸģ��ķ���
 * 
 * @author WM
 *
 */
public interface OrderDetailService {

	/**
	 * ��ѯָ��������ŵĶ�����ϸ��Ϣ����ҳ���ܣ�
	 * @param orderId		����Id
	 * @param pageNumber	ҳ��
	 * @return				����com.github.pagehelper.PageInfo���͵�ʵ��
	 */
	public abstract PageInfo<OrderDetail> selectByOrderId(Integer orderId,Integer pageNumber);
	
	
}
