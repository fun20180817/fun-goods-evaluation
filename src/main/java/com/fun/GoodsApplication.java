/**
 * Company:	F-space
 * Project Name:fun-goods-evaluation 
 * File Name:GoodsApplication.java 
 * Package Name:com.fun 
 * Date:2018年8月21日下午5:49:14 
 * Copyright (C) 2016,F-space. All rights reserved.
 * 
 */
package com.fun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/** 
 * ClassName: GoodsApplication <br/> 
 * Function: server start. <br/> 
 * date: 2018年8月21日 下午5:49:14 <br/> 
 * 
 * @author lishuai11 
 * @version  
 * @since JDK 1.8
 */
@SpringBootApplication
//@EnableDiscoveryClient
@EnableJpaAuditing
public class GoodsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GoodsApplication.class, args);
	}

}
