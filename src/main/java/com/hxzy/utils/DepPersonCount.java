package com.hxzy.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hxzy.mapper.TbDepartmentMapper;
import com.hxzy.mapper.TbEmployeeMapper;
import com.hxzy.pojo.TbDepartment;
import com.hxzy.pojo.TbEmployeeExample;
import com.hxzy.pojo.TbEmployeeExample.Criteria;

public class DepPersonCount {
	
	//Map<departmentid, EmployeeCount>
	private Map<Long, Long> depCounts = new HashMap<Long, Long>();
	/***
	 * 获取每个部门的员工人数
	 * @param tbEmployeeMapper
	 * @param tbDepartmentMapper
	 * @return Map<部门ID, 员工人数>
	 */
	public Map<Long, Long> CountPack(TbEmployeeMapper tbEmployeeMapper, TbDepartmentMapper tbDepartmentMapper){
		List<TbDepartment> departments = tbDepartmentMapper.selectByExample(null);
		for (TbDepartment tbDepartment : departments) {
			TbEmployeeExample example = new TbEmployeeExample();
			Criteria criteria = example.createCriteria();
			criteria.andEmDepartmentidEqualTo(tbDepartment.getId());
			Long count = (long) tbEmployeeMapper.countByExample(example);
			depCounts.put((long)tbDepartment.getId(), count);
		}
		return depCounts;
	}
	
}
