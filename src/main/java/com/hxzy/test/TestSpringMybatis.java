package com.hxzy.test;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hxzy.mapper.TbDepartmentMapper;
import com.hxzy.mapper.TbEmployeeMapper;
import com.hxzy.pojo.TbDepartment;
import com.hxzy.pojo.TbEmployee;

@RunWith(SpringJUnit4ClassRunner.class) //加载Spring容器
@ContextConfiguration("classpath:applicationContext.xml") //加载配置文件
public class TestSpringMybatis {
	@Autowired
	private TbEmployeeMapper tbEmployeeMapper;
	@Autowired
	private TbDepartmentMapper tbDepartmentMapper;
	
	@org.junit.Test
	public void test() {
		List<TbEmployee> selectByExample = tbEmployeeMapper.selectByExample(null);
		for (TbEmployee tbEmployee : selectByExample) {
			System.out.println(tbEmployee);
		}
	}

	@org.junit.Test
	public void test1() {
		List<TbDepartment> selectByExample = tbDepartmentMapper.selectByExample(null);
		for (TbDepartment tbDepartment : selectByExample) {
			System.out.println(tbDepartment);
		}
	}
}
