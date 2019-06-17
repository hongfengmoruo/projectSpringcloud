package com.springcloud.vo;

import java.util.Map;

import lombok.Data;

/**
 * ���屾��Ŀ������Controller���صĽ������
 * @author WM
 *
 */
@Data
public class ResultValue implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * ���õ�ǰ���ؽ����״̬��0��ʾ�ɹ���1��ʾʧ��
	 */
	private Integer code;
	/**
	 * ���÷��ص���Ϣ
	 */
	private String massage;
	/**
	 * ���÷��ص�����
	 */
	private Map<String,Object> dataMap;
}
