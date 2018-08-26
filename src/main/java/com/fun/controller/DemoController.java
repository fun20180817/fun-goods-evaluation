package com.fun.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fun.result.Result;

/**
 * ClassName: DemoController <br/>
 * Function: 接口规范. <br/>
 * 
 * 
 * 规范：<br/>
 * ①商品模块url：/v1/fun/goods/... <br/>
 * ②结尾不能以"/"结束 <br/>
 * ③url不能使用拼音拼写，只能使用小写英文字母，数字，下划线组成 <br/>
 * ④请求方式：PUT(创建);POST(更新);GET(查询);DELETE(删除) <br/>
 * 
 * 
 * date: 2018年8月25日 下午9:06:00 <br/>
 * 
 * @author lishuai11
 * @version
 * @since JDK 1.8
 */
@RestController
@RequestMapping(value = "/v1/fun/goods/")
public class DemoController {

	/**
	 * 
	 * create:(创建接口：PUT请求). <br/>
	 * 
	 * @author lishuai11
	 * @return
	 * @since JDK 1.8
	 */
	@RequestMapping(value = "create", method = RequestMethod.PUT)
	public Result create(@RequestBody String request) {
		return Result.success("创建成功");
	}

	/**
	 * 
	 * update:(更新接口：POST请求). <br/>
	 * 
	 * @author lishuai11
	 * @return
	 * @since JDK 1.8
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public Result update(@RequestBody String request) {
		return Result.success("更新成功", "");
	}

	/**
	 * 
	 * delete:(删除接口：DELETE请求). <br/>
	 * 
	 * @author lishuai11
	 * @return
	 * @since JDK 1.8
	 */
	@RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
	public Result delete(@PathVariable(name = "id") int id) {
		return Result.fail(500, "删除失败，找不到id：" + id + "的用户");
	}

	/**
	 * 
	 * read:(查询接口：GET请求). <br/>
	 * 
	 * @author lishuai11
	 * @return
	 * @since JDK 1.8
	 */
	@RequestMapping(value = "read/{id}", method = RequestMethod.GET)
	public Result read(@PathVariable(name = "id") int id) {
		return Result.fail(400, "请求参数错误");
	}

}
