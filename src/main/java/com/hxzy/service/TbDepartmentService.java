package com.hxzy.service;

import java.util.List;

import com.hxzy.pojo.TbDepartment;

public interface TbDepartmentService {
	
	public List<TbDepartment> selectDeps();
	/**
	 * 添加部门信息
	 * @param dep
	 * @return
	 */
	public int insertDepartment(TbDepartment dep);
	/**
	 * 删除部门信息
	 * @param id
	 * @return
	 */
	public int deleteDepartment(int id);
}
