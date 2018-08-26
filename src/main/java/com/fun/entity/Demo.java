package com.fun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fun.entity.base.EntityObject;

@Entity
@Table(name = "`DEMO`")
@EntityListeners(AuditingEntityListener.class)
public class Demo extends EntityObject{

	private static final long serialVersionUID = 419616439903776513L;

	@Column(name = "`NAME`")
	private String name;

	@Column(name = "`AGE`")
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
