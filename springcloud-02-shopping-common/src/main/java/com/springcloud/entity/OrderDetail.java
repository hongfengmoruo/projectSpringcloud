package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ORDER_DETAIL���Ӧ��ʵ���࣬���ڷ�װһ�ж�����ϸ��Ϣ
 * @author WM
 *
 */

@Data	//get,set��tostring,hashcode����
@NoArgsConstructor	//�޲ι���
@AllArgsConstructor	//�вι���
public class OrderDetail implements java.io.Serializable{
   
	private static final long serialVersionUID = 1L;

	private Integer orderDetailId;

    private Integer orderId;

    private String goodId;

    private String goodName;

    private Double transactionPrice;

    private Integer transactionCount;

    
}