/**
 * @(#)Flag.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	卜丹丹  2018年7月9日
 */
package com.dd.test;

/**
 * TODO 填写功能说明
 * @author 卜丹丹
 */
enum Flag {

	SUCCESS(0,"成功"),FAILURE(1,"失败");
	Integer flag;
	String messager;
	Flag(Integer flag,String messager){
		this.flag=flag;
		this.messager=messager;
	}
}
