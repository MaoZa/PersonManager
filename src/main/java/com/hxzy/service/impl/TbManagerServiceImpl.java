package com.hxzy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxzy.mapper.TbManagerMapper;
import com.hxzy.pojo.TbManager;
import com.hxzy.pojo.TbManagerExample;
import com.hxzy.pojo.TbManagerExample.Criteria;
import com.hxzy.service.TbManagerService;

@Service
public class TbManagerServiceImpl implements TbManagerService {

	@Autowired
	private TbManagerMapper tbManagerMapper;
	
	@Override
	public List<TbManager> queryManager() {
		return tbManagerMapper.selectByExample(null);
	}

	@Override
	public TbManager queryOneManager(String account, String password) {
		TbManagerExample example = new TbManagerExample();
		Criteria criteria = example.createCriteria();
		criteria.andAccountEqualTo(account);
		criteria.andPasswordEqualTo(password);
		List<TbManager> tbManagers = tbManagerMapper.selectByExample(example);
		if(tbManagers != null && tbManagers.size() != 0) {
			return tbManagers.get(0);
		}else {
			return null;
		}
	}

	@Override
	public int updateManager(TbManager manager) {
		int i = tbManagerMapper.updateByPrimaryKeySelective(manager);
		return i;
	}

	@Override
	public int insertManager(TbManager manager) {
		return tbManagerMapper.insertSelective(manager);
	}

	@Override
	public void deleteManager(Integer id) {
		tbManagerMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<TbManager> checkManager(String account, String password) {
		TbManagerExample example = new TbManagerExample();
		Criteria criteria = example.createCriteria();
		criteria.andAccountEqualTo(account);
		criteria.andPasswordEqualTo(password);
		return tbManagerMapper.selectByExample(example);
	}
	
	@Override
	public List<TbManager> checkManager(String account) {
		TbManagerExample example = new TbManagerExample();
		Criteria criteria = example.createCriteria();
		criteria.andAccountEqualTo(account);
		return tbManagerMapper.selectByExample(example);
	}

}
