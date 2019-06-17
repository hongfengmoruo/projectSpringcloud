package com.springcloud.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * ORDERS���Ӧ��ʵ���࣬���ڷ�װһ�ж�����Ϣ
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
	 * �������
	 */
	private Integer orderId;

    /**
     * ��ǰ�������û���Ϣ
     */
    private Users user;

    /**
     * �ջ�������
     */
    private String consigneeName;

    /**
     * �ջ��˵绰�����ʡ����Ĭ��Ϊ�û����е��ջ���ַ
     */
    private String consigneeNumber;

    /**
     * �ջ���ַ�����ʡ����Ĭ��Ϊ�û����е��ջ���ַ
     */
    private String consigneeSite;

    /**
     * ����ʱ�䣬Ĭ�ϵ�ǰʱ��
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderTime;
    /**
     * ��ѯ������������ʼʱ��
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDateMin;
    /**
     * ��ѯ������������ֹʱ��
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDateMax;

    /**
     * �����ܶ�
     */
    private Double orderAmount;

    /**
     * ����״̬��0�����1��������2���ջ���3�Ѹ��4���˻�
     */
    private Integer orderStatus;

    /**
     * ��ѯ��������������
     */
    private String orderMonth;
    /**
     * ��ѯ��������ʼ����
     */
    private String startMonth;
    
    /**
     * ��ѯ��������ֹ����
     */
    private String endMonth;
    
    /**
     *ͳ�ƽ�������۶� 
     */
    private double orderPrice;
   
}