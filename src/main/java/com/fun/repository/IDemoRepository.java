package com.fun.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.fun.entity.Demo;

/** 
 * ClassName: IDemoRepository <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * date: 2018年8月21日 下午6:14:02 <br/> 
 * 
 * @author lishuai11 
 * @version  
 * @since JDK 1.8
 */
@Transactional
public interface IDemoRepository extends PagingAndSortingRepository<Demo, Integer>, JpaSpecificationExecutor<Demo> {

}
