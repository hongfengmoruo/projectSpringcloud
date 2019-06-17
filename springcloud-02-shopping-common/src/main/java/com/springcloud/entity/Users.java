package com.springcloud.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User表对应的实体类：用于封装USERS表中的一行用户信息
 * @author WM
 *
 */
@Entity
@Table(name = "users")
@Data	//get,set，tostring,hashcode方法
@NoArgsConstructor	//无参构造
@AllArgsConstructor	//有参构造
public class Users implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 用户编号
	 */
	@Column(name = "user_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	/**
	 * 用户姓名
	 */
	@Column(name = "user_name")
	private String userName;
	/**
	 * 身份证号
	 */
	@Column(name = "user_number")
	private String userNumber;
	/**
	 * 用户密码
	 */
	@Column(name = "user_password")
	private String userPassword;
	/**
	 * 用户性别：0男，1女
	 */
	@Column(name = "user_sex")
	private Integer userSex;
	//联系电话
	@Column(name = "user_phone")
	private String userPhone;
	/**
	 * 收货地址
	 */
	@Column(name = "user_site")
	private String userSite;
	/**
	 * 出生年月
	 */
	@Column(name = "user_birthday")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date userBirthday;
	/**
	 * 电子邮件
	 */
	@Column(name = "user_email")
	private String userEmail;
	/**
	 * 头像
	 */
	@Column(name = "user_photo")
	private String userPhoto;
	/**
	 * 权限编号(0:超级管理员，1：普通管理员，2：普通用户，3：VIP用户)
	 */
	@Column(name = "jdiction_id")
	private Integer jdictionId;
	/**
	 * 用户状态（0：可用，1：禁用）
	 */
	@Column(name = "user_status")
	private Integer userStatus;
	


}
