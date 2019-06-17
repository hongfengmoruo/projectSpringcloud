package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ORDER_DETAIL表对应的实体类，用于封装一行订单明细信息
 * @author WM
 *
 */

@Data	//get,set，tostring,hashcode方法
@NoArgsConstructor	//无参构造
@AllArgsConstructor	//有参构造
public class OrderDetail implements java.io.Serializable{
   
	private static final long serialVersionUID = 1L;

	private Integer orderDetailId;

    private Integer orderId;

    private String goodId;

    private String goodName;

    private Double transactionPrice;

    private Integer transactionCount;

    
}