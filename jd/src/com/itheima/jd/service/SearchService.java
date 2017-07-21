package com.itheima.jd.service;

import com.itheima.jd.po.Result;

public interface SearchService {
	/**
	 * 根据条件从索引库中查询数据
	 * 
	 * @param queryString 查询关键词
	 * @param catalog_name 商品分类
	 * @param price 商品价格
	 * @param sort  排序
	 * @param page  当前页码
	 * @return
	 */
	Result search(String queryString, String catalog_name, String price, String sort, Integer page) throws Exception;
}