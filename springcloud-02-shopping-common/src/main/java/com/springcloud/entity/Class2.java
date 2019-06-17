package com.springcloud.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CLASS2���Ӧ��ʵ���࣬���ڱ������һ��һ�������Ϣ
 * @author WM
 *
 */
@Data
@Table(name="class2")
@AllArgsConstructor
@NoArgsConstructor
public class Class2 implements java.io.Serializable{
   
	private static final long serialVersionUID = 1L;

	/**
     * �������
     */
	@Id
	@Column(name="class2_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer class2Id;

    /**
     * ��������
     */
    private String class2Name;

    /**
     * �������
     */
    private Integer class1Id;

    /**
     * ��ע
     */
    private String remark;

}