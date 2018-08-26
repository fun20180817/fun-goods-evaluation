package com.fun.shopcar;

import java.io.Serializable;

import com.fun.entity.Goods;

/**
 * ClassName: CarItem <br/>
 * Function: 购物车清单. <br/>
 * date: 2018年8月21日 下午6:24:31 <br/>
 * 
 * @author lishuai11
 * @version
 * @since JDK 1.8
 */
public class CarItem implements Serializable {

	private static final long serialVersionUID = 6395336724712730845L;

	private Goods goods;

	private Boolean isHave = true;

	private Integer count;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((goods == null) ? 0 : goods.hashCode());
		return count;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CarItem carItem = (CarItem) obj;
		if (goods == null) {
			if (carItem.goods != null) {
				return false;
			}
		} else if (goods.getId() != carItem.goods.getId()) {
			return false;
		}
		return true;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Boolean getIsHave() {
		return isHave;
	}

	public void setIsHave(Boolean isHave) {
		this.isHave = isHave;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
