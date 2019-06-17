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
 * CLASS1表对应的实体类，用于保存表中一行二级类别信息
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
     * 类别一编号
     */
	@Id
	@Column(name="class1_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer class1Id;

    /**
     * 类别一名称
     */
    private String class1Name;

    /**
     * 类别一序号
     */
    private Integer class1Num;

    /**
     * 备注
     */
    private String remark;

   
}