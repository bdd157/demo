/**
 * @(#)Test3.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	卜丹丹  2018年7月9日
 */
package com.dd.test;

import com.dd.domain.Person;

/**
 * TODO 填写功能说明
 * @author 卜丹丹
 */
public class Test3 {

	public static void main(String[] args) {
		Person p=new Person();
		p.setId(1);
		p.setUsername("tom");
		p.setDel(Flag.SUCCESS.flag);
		p.setBz(Flag.SUCCESS.messager);
		
		System.out.println(p.getBz()+p.getDel());
		
	}
}
