package com.hxzy.test;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hxzy.pojo.TbManager;
import com.hxzy.service.TbManagerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestManager {
	
	@Autowired
	private TbManagerService man;

	@Test
	public void test() throws Exception {
		/*InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sqlSessionFactory.openSession();
		TbManagerMapper mapper = session.getMapper(TbManagerMapper.class);
		List<TbManager> list = mapper.selectByExample(null);
		System.out.println(list.size());
		for (TbManager tbManager : list) {
			System.out.println(tbManager);
		}*/
		List<TbManager> list = man.queryManager();
		for (TbManager tbManager : list) {
			System.out.println(tbManager.getAccount());
			System.out.println(tbManager.getPassword());
		}
	}
	
	@Test
	public void test1() throws Exception {
		String account = "tsoft";
		String password = "111";
		TbManager list = man.queryOneManager(account, password);
		System.out.println(list);
	}

}
