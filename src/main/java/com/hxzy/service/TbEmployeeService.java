package com.hxzy.service;

import java.util.List;

import com.hxzy.pojo.TbEmployee;

public interface TbEmployeeService {
	
	public List<TbEmployee> selectEmps();
	public TbEmployee queryOneEmployee(Integer id);
	public void delOneEmployee(Integer id);
	public int updateOneEmployee(TbEmployee employee);
	/**
	 * 新增员工信息
	 * @param employee
	 * @return
	 */
	public int insertEmployee(TbEmployee employee);
}
