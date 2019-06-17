package com.springcloud.entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  GOODS表对应的实体类：用于封装GOODS表中的一行用户信息
 * @author WM
 *
 */
@Data
@Table(name="goods")
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;

	/**
     * 商品编号
     */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer goodId;

    /**
     * 商品名称
     */
	
    private String goodName;

    /**
     * 商品价格
     */
	
    private Double goodPrices;

    /**
     * 商品折扣价
     */
	
    private Double goodDiscount;

    /**
     * 商品状态：0预售，1热卖中，2已下架
     */
	
    private Integer goodStatus;

    /**
     * 商品数量
     */
	
    private Integer goodCount;

    /**
     * 是否新品：0是新品，1是非新品
     */
	
    private Integer goodIsNew;

    /**
     * 是否热卖：0是热卖，1是非热卖
     */
	
    private Integer goodIsHot;

    /**
     * 商品级别
     */
	
    private Integer goodLevel;

    /**
     * 商品简介
     */
	
    private String goodBrief;

    /**
     * 商品详情
     */
	
    private String goodDetails;

    /**
     * 商品图片
     */
	
    private String goodPhoto;

    /**
     * 类别二编号
     */
	
    private Integer class2Id;
    
    /**
     * 查询条件：商品价格下线
     */
	
    private Double goodsPriceMin;
    
    /**
     * 查询条件：商品价格下线
     */
	
    private Double goodsPriceMax;
    
    /**
     *查询条件：一级类型编号
     */
	
    private Integer class1Id;
    
    private Integer goodsSum;
   
}