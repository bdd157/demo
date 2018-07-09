/**
 * @(#)Test1.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	卜丹丹  2018年7月9日
 */
package com.dd.test;

import java.util.ArrayList;
import java.util.List;

import com.dd.domain.Person;
import com.google.gson.Gson;

/**
 * TODO 填写功能说明
 * @author 卜丹丹
 */
public class Test1 {
	public static void main(String[] args) {
		 Person p1=new Person();
		 p1.setId(11);
		 p1.setUsername("tom");
		 Person p2=new Person();
		 p2.setId(12);
		 p2.setUsername("leo");
		 
		 List<Person> list=new ArrayList<>();
		 list.add(p1);
		 list.add(p2);
		 
		 Gson gson=new Gson();
		 System.out.println(gson.toJson(list));
	}
}
