package com.hxzy.service;

import java.util.List;

import com.hxzy.pojo.TbTrain;

public interface TbTrainService {
	public List<TbTrain> queryTrain();
	public TbTrain queryTrainOne(Integer id);
	public void deleteTrain(int id);
	/**
	 * 添加培训信息
	 * @param train
	 * @return
	 */
	public int insertTrain(TbTrain train);
}
