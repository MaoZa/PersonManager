package com.hxzy.test;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hxzy.pojo.TbDepartment;
import com.hxzy.service.TbDepartmentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestPage {
	
	@Autowired
	private TbDepartmentService mapper;

	@Test
	public void test() {
		PageHelper.startPage(1,3);
		List<TbDepartment> list = mapper.selectDeps();
		PageInfo<TbDepartment> pageInfo = new PageInfo<>(list);
		System.out.println(pageInfo);
		System.out.println(list.size());
	}

}
