package com.fun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fun.entity.base.EntityObject;

/** 
 * ClassName: Goods <br/> 
 * Function: 商品(为了购物车临时建的表结构，需要完善). <br/> 
 * date: 2018年8月21日 下午6:24:50 <br/> 
 * 
 * @author lishuai11 
 * @version  
 * @since JDK 1.8
 */
@Entity
@Table(name = "`GOODS`")
@EntityListeners(AuditingEntityListener.class)
public class Goods  extends EntityObject{
	
	private static final long serialVersionUID = -7870464509698921152L;
	
	@Column(name = "`PRICE`")
	private Double price;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
