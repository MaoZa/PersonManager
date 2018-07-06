package com.hxzy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.hxzy.mapper.TbDepartmentMapper;
import com.hxzy.mapper.TbEmployeeMapper;
//import com.hxzy.pojo.TbDepartment;
import com.hxzy.pojo.TbEmployee;
import com.hxzy.service.TbEmployeeService;
//import com.hxzy.utils.TbEmployeeWorkPack;

@Service
public class TbEmployeeServiceImpl implements TbEmployeeService {
	
	@Autowired
	private TbEmployeeMapper tbEmployeeMapper;
	/*@Autowired
	private TbDepartmentMapper tbDepartmentMapper;*/
	
	public List<TbEmployee> selectEmps() {
		List<TbEmployee> employees = tbEmployeeMapper.selectByExample(null);
		//List<TbDepartment> departments = tbDepartmentMapper.selectByExample(null);
		/*List<TbEmployee> eTbEmployees = new TbEmployeeWorkPack().Pack(employees, departments);*/
		return employees;
	}

	public TbEmployee queryOneEmployee(Integer id) {
		return tbEmployeeMapper.selectByPrimaryKey(id);
	}
	
	public void delOneEmployee(Integer id) {
		tbEmployeeMapper.deleteByPrimaryKey(id);
	}

	public int updateOneEmployee(TbEmployee employee) {
		return tbEmployeeMapper.updateByPrimaryKeySelective(employee);
	}

	@Override
	public int insertEmployee(TbEmployee employee) {
		return tbEmployeeMapper.insertSelective(employee);
	}
}
