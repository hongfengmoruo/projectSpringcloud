package com.springcloud.entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  GOODS���Ӧ��ʵ���ࣺ���ڷ�װGOODS���е�һ���û���Ϣ
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
     * ��Ʒ���
     */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer goodId;

    /**
     * ��Ʒ����
     */
	
    private String goodName;

    /**
     * ��Ʒ�۸�
     */
	
    private Double goodPrices;

    /**
     * ��Ʒ�ۿۼ�
     */
	
    private Double goodDiscount;

    /**
     * ��Ʒ״̬��0Ԥ�ۣ�1�����У�2���¼�
     */
	
    private Integer goodStatus;

    /**
     * ��Ʒ����
     */
	
    private Integer goodCount;

    /**
     * �Ƿ���Ʒ��0����Ʒ��1�Ƿ���Ʒ
     */
	
    private Integer goodIsNew;

    /**
     * �Ƿ�������0��������1�Ƿ�����
     */
	
    private Integer goodIsHot;

    /**
     * ��Ʒ����
     */
	
    private Integer goodLevel;

    /**
     * ��Ʒ���
     */
	
    private String goodBrief;

    /**
     * ��Ʒ����
     */
	
    private String goodDetails;

    /**
     * ��ƷͼƬ
     */
	
    private String goodPhoto;

    /**
     * �������
     */
	
    private Integer class2Id;
    
    /**
     * ��ѯ��������Ʒ�۸�����
     */
	
    private Double goodsPriceMin;
    
    /**
     * ��ѯ��������Ʒ�۸�����
     */
	
    private Double goodsPriceMax;
    
    /**
     *��ѯ������һ�����ͱ��
     */
	
    private Integer class1Id;
    
    private Integer goodsSum;
   
}