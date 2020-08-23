package com.example.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @date 2020-08-22
 * @author chenws
 *    表中的字段下划线分割，对应类的驼峰名称变量
 */
@Data
@TableName("user_info")
@AllArgsConstructor
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7875454654L;
	
	//@TableField(exist = false) //表示该属性不为数据库表字段，但又是必须使用的。
	@TableId(type = IdType.ASSIGN_UUID)  //设置主键
	private int userId;
	
	//@TableField("user_name") 
	private String userName;

	private String password;
	//@TableLogic("用户内容")
	private String userContent;
	


}
