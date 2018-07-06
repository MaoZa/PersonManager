package com.hxzy.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxzy.mapper.TbDepartmentMapper;
import com.hxzy.mapper.TbEmployeeMapper;
import com.hxzy.pojo.TbDepartment;
import com.hxzy.service.TbDepartmentService;
import com.hxzy.utils.DepPersonCount;

@Service
public class TbDepartmentServiceImpl implements TbDepartmentService {

	@Autowired
	private TbDepartmentMapper tbDepartmentMapper;
	@Autowired
	private TbEmployeeMapper tbEmployeeMapper;
	
	public List<TbDepartment> selectDeps() {
		List<TbDepartment> departments = tbDepartmentMapper.selectByExample(null);
		return departments;
	}
	public Map<Long, Long> depCountPerson(){
		DepPersonCount depPersonCount = new DepPersonCount();
		Map<Long, Long> countPack = depPersonCount.CountPack(tbEmployeeMapper, tbDepartmentMapper);
		return countPack;
	}
	@Override
	public int insertDepartment(TbDepartment dep) {
		int i = tbDepartmentMapper.insertSelective(dep);
		return i;
	}
	@Override
	public int deleteDepartment(int id) {
		int i = tbDepartmentMapper.deleteByPrimaryKey(id);
		return i;
	}

}
