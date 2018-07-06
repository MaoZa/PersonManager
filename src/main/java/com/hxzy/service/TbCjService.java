package com.hxzy.service;

import java.util.List;

import com.hxzy.pojo.TbCj;

public interface TbCjService {
	public List<TbCj> queryCj();
	public TbCj queryOneCj(int id);
	/**
	 * 添加奖惩信息
	 * @param cj
	 * @return
	 */
	public int insertCj(TbCj cj);
	/**
	 * 删除奖惩信息
	 * @param id
	 * @return
	 */
	public int deleteCj(int id);
}
