package com.springcloud.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * ORDERS表对应的实体类，用于封装一行订单信息
 * 
 * @author WM
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders implements java.io.Serializable{
    
	private static final long serialVersionUID = -339789188719956952L;

	/**
	 * 订单编号
	 */
	private Integer orderId;

    /**
     * 当前订单的用户信息
     */
    private Users user;

    /**
     * 收货人姓名
     */
    private String consigneeName;

    /**
     * 收货人电话，如果省略则默认为用户表中的收货地址
     */
    private String consigneeNumber;

    /**
     * 收货地址，如果省略则默认为用户表中的收货地址
     */
    private String consigneeSite;

    /**
     * 订单时间，默认当前时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderTime;
    /**
     * 查询条件：订单起始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDateMin;
    /**
     * 查询条件：订单终止时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDateMax;

    /**
     * 订单总额
     */
    private Double orderAmount;

    /**
     * 订单状态：0待付款，1代发货，2待收货，3已付款，4已退货
     */
    private Integer orderStatus;

    /**
     * 查询条件：订单年月
     */
    private String orderMonth;
    /**
     * 查询条件：起始年月
     */
    private String startMonth;
    
    /**
     * 查询条件：终止年月
     */
    private String endMonth;
    
    /**
     *统计结果的销售额 
     */
    private double orderPrice;
   
}