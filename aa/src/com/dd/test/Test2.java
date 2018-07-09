/**
 * @(#)Test2.java
 * Description:	TODO 填写文件作用简要说明
 * Version :	0.0.0
 * Copyright:	Copyright (c) 哈尔滨修盾信息科技有限公司  版权所有
 * Create by:	卜丹丹  2018年7月9日
 */
package com.dd.test;

import java.util.Iterator;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * TODO 填写功能说明
 * @author 卜丹丹
 */
public class Test2 {

	public static void main(String[] args) {
		Gson gson=new Gson();
		String jsonString= "{\"id\":11,\"username\":\"tom\",\"age\":\"22\"}";
		Map<String,String> map=gson.fromJson(jsonString, new TypeToken<Map<String,String>>(){}.getType());
		
		System.out.println(map);
		
		Iterator<String> it=map.keySet().iterator();
		while(it.hasNext()){
			System.out.println("keyName:"+it.next());
		}
		for(String str:map.values()){
			System.out.println("value:"+str);
		}
	}
}
