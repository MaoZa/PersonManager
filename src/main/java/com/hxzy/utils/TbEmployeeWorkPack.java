package com.hxzy.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hxzy.pojo.TbDepartment;
import com.hxzy.pojo.TbEmployee;

public class TbEmployeeWorkPack {
	Map<Integer,String> works = new HashMap<Integer, String>();
	/***
	 * 重新封装TbEmployee 将Depid修改为depname
	 * @param employees
	 * @param departments
	 * @return List<TbEmployee>
	 */
	public List<TbEmployee> Pack(List<TbEmployee> employees, List<TbDepartment> departments) {
		//把部门Id和部门名称封装
		for (TbDepartment department : departments) {
			works.put(department.getId(), department.getDtName());
		}
		//设置员工id
		for (TbEmployee employee : employees) {
			//获得部门名称，转换成部门id
			//String depName = works.get(employee.getEmDepartmentid());
			employee.setEmDepartmentid(1);
		}
		return employees;
	}
}
