package com.hxzy.test;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hxzy.mapper.TbDepartmentMapper;
import com.hxzy.mapper.TbEmployeeMapper;
import com.hxzy.pojo.TbDepartment;
import com.hxzy.pojo.TbEmployee;
import com.hxzy.utils.DepPersonCount;
import com.hxzy.utils.TbEmployeeWorkPack;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {
	
	@Autowired
	private TbEmployeeMapper tbEmployeeMapper;
	@Autowired
	private TbDepartmentMapper tbDepartmentMapper;
	
	@org.junit.Test
	public void test() {
		try {
			InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
			SqlSession session = sqlSessionFactory.openSession();
			TbEmployeeMapper mapper = session.getMapper(TbEmployeeMapper.class);
			
			List<TbEmployee> selectByExample = mapper.selectByExample(null);
			for (TbEmployee tbEmployee : selectByExample) {
				System.out.println(tbEmployee);
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@org.junit.Test
	public void testC3p0() throws PropertyVetoException {
		//c3p0数据�?
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/db_personmanager");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("123456");
		System.out.println(comboPooledDataSource);
	}
	
	@org.junit.Test
	public void test3() {
		List<TbEmployee> employees = tbEmployeeMapper.selectByExample(null);
		System.out.println(employees);
		List<TbDepartment> departments = tbDepartmentMapper.selectByExample(null);
		System.out.println(departments);
		List<TbEmployee> employees2 = new TbEmployeeWorkPack().Pack(employees, departments);
		System.out.println(employees2);
	}
	@org.junit.Test
	public void test4() {
		DepPersonCount depPersonCount = new DepPersonCount();
		Map<Long, Long> countPack = depPersonCount.CountPack(tbEmployeeMapper,tbDepartmentMapper);
		System.out.println(countPack);
	}
}
