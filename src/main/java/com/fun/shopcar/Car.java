package com.fun.shopcar;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.Lists;

/**
 * ClassName: Car <br/>
 * Function: 购物车. <br/>
 * date: 2018年8月21日 下午6:16:15 <br/>
 * 
 * @author lishuai11
 * @version
 * @since JDK 1.8
 */
public class Car implements Serializable {

	private static final long serialVersionUID = -6902540076223706133L;

	private List<CarItem> items = Lists.newArrayList();

	public void addItem(CarItem item) {
		if (items.contains(item)) {
			for (CarItem carItem : items) {
				if (carItem.equals(item)) {
					carItem.setCount(item.getCount() + carItem.getCount());
				}
			}
		} else {
			items.add(item);
		}
	}

	public List<CarItem> getItems() {
		return items;
	}

	public void setItems(List<CarItem> items) {
		this.items = items;
	}

	/*
	 * 商品总价格
	 */
	@JsonIgnore
	public Integer getProductAmount() {
		Integer result = 0;
		for (CarItem carItem : items) {
			result += carItem.getCount();
		}
		return result;
	}

	/*
	 * 商品总价
	 */
	@JsonIgnore
	public Double getProductPrice() {
		Double result = 0.00;
		for (CarItem carItem : items) {
			result += carItem.getCount() * carItem.getGoods().getPrice();
		}
		return result;
	}

	/*
	 * 运费
	 */
	@JsonIgnore
	public Double getFee() {
		Double result = 0.0;
		if (getProductPrice() < 79) {
			result = 6.00;
		}
		return result;
	}

    /*
     * 总价
     */
	@JsonIgnore
	public Double getTotalPrice() {
		return getProductPrice() + getFee();
	}

}
