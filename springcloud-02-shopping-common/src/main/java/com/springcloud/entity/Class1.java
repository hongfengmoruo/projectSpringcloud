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
 * CLASS1���Ӧ��ʵ���࣬���ڱ������һ�ж��������Ϣ
 * @author WM
 *
 */
@Data
@Table(name="class1")
@AllArgsConstructor
@NoArgsConstructor
public class Class1 implements java.io.Serializable{
   
	private static final long serialVersionUID = 1L;

	/**
     * ���һ���
     */
	@Id
	@Column(name="class1_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer class1Id;

    /**
     * ���һ����
     */
    private String class1Name;

    /**
     * ���һ���
     */
    private Integer class1Num;

    /**
     * ��ע
     */
    private String remark;

   
}