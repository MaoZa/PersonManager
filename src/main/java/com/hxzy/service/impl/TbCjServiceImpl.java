package com.hxzy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxzy.mapper.TbCjMapper;
import com.hxzy.pojo.TbCj;
import com.hxzy.service.TbCjService;
@Service
public class TbCjServiceImpl implements TbCjService {
	
	@Autowired
	private TbCjMapper tbCjMapper;
	
	public List<TbCj> queryCj(){
		return tbCjMapper.selectByExample(null);
	}

	public TbCj queryOneCj(int id) {
		return tbCjMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insertCj(TbCj cj) {
		int i = tbCjMapper.insertSelective(cj);
		return i;
	}

	@Override
	public int deleteCj(int id) {
		int i = tbCjMapper.deleteByPrimaryKey(id);
		return i;
	}
}
