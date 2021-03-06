package com.demo.common.model;

import com.demo.common.model.base.BaseBlog;
import com.jfinal.plugin.activerecord.Page;

/**
 * Generated by JFinal.
 * Blog model.
 * 数据库字段名建议使用驼峰命名规则，便于与 java 代码保持一致，如字段名： userId
 */
@SuppressWarnings("serial")
public class Blog extends BaseBlog<Blog> {
	
	public static final Blog me = new Blog();
	
	/**
	 * 所有 sql 与业务逻辑写在 Model 或 Service 中，不要写在 Controller 中，养成好习惯，有利于大型项目的开发与维护
	 */
	public Page<Blog> paginate(int pageNumber, int pageSize) {
		Page<Blog> p = null;
		p = paginate(pageNumber, pageSize, "select *", "from blog order by id asc");
		return p;
	}
}


