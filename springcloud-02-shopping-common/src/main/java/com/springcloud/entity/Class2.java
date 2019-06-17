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
 * CLASS2表对应的实体类，用于保存表中一行一级类别信息
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
     * 类别二编号
     */
	@Id
	@Column(name="class2_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer class2Id;

    /**
     * 类别二名称
     */
    private String class2Name;

    /**
     * 类别二序号
     */
    private Integer class1Id;

    /**
     * 备注
     */
    private String remark;

}