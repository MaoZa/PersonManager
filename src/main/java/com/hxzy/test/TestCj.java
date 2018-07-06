package com.hxzy.test;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hxzy.pojo.TbCj;
import com.hxzy.service.TbCjService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestCj {

	@Autowired
	private TbCjService cjs;
	
	@Test
	public void test() {
		List<TbCj> list = cjs.queryCj();
		for (TbCj tbCj : list) {
			System.out.println(tbCj.getId());
		}
	}
	
	@Test
	public void test1() {
		TbCj cj = new TbCj();
		cj.setCjTitle("nihaoa");
		int row = cjs.insertCj(cj);
		if (row > 0) {
			System.out.println("信息添加成功！");
		}
	}

}
