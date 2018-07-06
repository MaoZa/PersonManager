package com.hxzy.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.hxzy.pojo.TbDepartment;
import com.hxzy.pojo.TbDepartmentExample;

public interface TbDepartmentMapper {
    int countByExample(TbDepartmentExample example);

    int deleteByExample(TbDepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbDepartment record);

    int insertSelective(TbDepartment record);

    List<TbDepartment> selectByExample(TbDepartmentExample example);

    TbDepartment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbDepartment record, @Param("example") TbDepartmentExample example);

    int updateByExample(@Param("record") TbDepartment record, @Param("example") TbDepartmentExample example);

    int updateByPrimaryKeySelective(TbDepartment record);

    int updateByPrimaryKey(TbDepartment record);
}