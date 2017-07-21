package com.itheima.jd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.jd.po.Result;
import com.itheima.jd.service.SearchService;

@Controller
public class SearchController {

	@Autowired
	private SearchService searchService;
	
	@RequestMapping("list")
	public String queryProduct(Model model, String queryString, String catalog_name, String price, String sort,
			Integer page) throws Exception {
		// 根据条件搜索
		Result result = this.searchService.search(queryString, catalog_name, price, sort, page);

		// 把结果集放到模型中
		model.addAttribute("result", result);

		// 搜索条件数据回显
		model.addAttribute("queryString", queryString);
		model.addAttribute("catalog_name", catalog_name);
		model.addAttribute("price", price);
		model.addAttribute("sort", sort);
		model.addAttribute("page", page);

		return "product_list";
	}
}
