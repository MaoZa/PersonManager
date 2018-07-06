package com.hxzy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxzy.mapper.TbTrainMapper;
import com.hxzy.pojo.TbTrain;
import com.hxzy.service.TbTrainService;

@Service
public class TbTrainServiceImpl implements TbTrainService {

	@Autowired
	private TbTrainMapper tbTrainMapper;
	
	public List<TbTrain> queryTrain() {
		return tbTrainMapper.selectByExample(null);
	}
	public TbTrain queryTrainOne(Integer id) {
		return tbTrainMapper.selectByPrimaryKey(id);
	}
	public void deleteTrain(int id) {
		tbTrainMapper.deleteByPrimaryKey(id);
	}
	public int insertTrain(TbTrain train) {
		return tbTrainMapper.insertSelective(train);
	}
}
