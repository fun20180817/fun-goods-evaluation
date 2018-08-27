package com.fun.entity.base;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

/** 
 * ClassName: EntityObject <br/> 
 * Function: 实体类顶级类. <br/> 
 * date: 2018年08月22日 下午4:31:53 <br/> 
 * 
 * @author lishuai8 
 * @version  
 * @since JDK 1.8
 */
@MappedSuperclass
public class EntityObject implements Serializable {

	private static final long serialVersionUID = 249507396927414332L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "`ID`")
	private int id;

	@CreatedDate
	@Column(name = "`CREATEDTIME`", updatable = false, columnDefinition = "bigint(20) DEFAULT 0")
	private long createdTime;

	@LastModifiedDate
	@Column(name = "`LASTMODIFIEDTIME`", columnDefinition = "bigint(20) DEFAULT 0")
	private long lastModifiedTime;
	
	@Column(name = "`DELETED`")
	private boolean deleted;
	
	/**
	 * 乐观锁
	 */
	@Version
	@Column(name = "`VERSION`", columnDefinition = "int(11) DEFAULT 0")
	private int version;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(long createdTime) {
		this.createdTime = createdTime;
	}

	public long getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(long lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	
	public int getVersion() {
		return version;
	}
	
	public void setVersion(int version) {
		this.version = version;
	}

}

