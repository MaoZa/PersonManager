package com.hxzy.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.hxzy.pojo.TbEmployee;
import com.hxzy.pojo.TbEmployeeExample;

public interface TbEmployeeMapper {
    int countByExample(TbEmployeeExample example);

    int deleteByExample(TbEmployeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbEmployee record);

    int insertSelective(TbEmployee record);

    List<TbEmployee> selectByExample(TbEmployeeExample example);

    TbEmployee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbEmployee record, @Param("example") TbEmployeeExample example);

    int updateByExample(@Param("record") TbEmployee record, @Param("example") TbEmployeeExample example);

    int updateByPrimaryKeySelective(TbEmployee record);

    int updateByPrimaryKey(TbEmployee record);
}