package com.hxzy.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.hxzy.pojo.TbCj;
import com.hxzy.pojo.TbCjExample;

public interface TbCjMapper {
    int countByExample(TbCjExample example);

    int deleteByExample(TbCjExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCj record);

    int insertSelective(TbCj record);

    List<TbCj> selectByExampleWithBLOBs(TbCjExample example);

    List<TbCj> selectByExample(TbCjExample example);

    TbCj selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCj record, @Param("example") TbCjExample example);

    int updateByExampleWithBLOBs(@Param("record") TbCj record, @Param("example") TbCjExample example);

    int updateByExample(@Param("record") TbCj record, @Param("example") TbCjExample example);

    int updateByPrimaryKeySelective(TbCj record);

    int updateByPrimaryKeyWithBLOBs(TbCj record);

    int updateByPrimaryKey(TbCj record);
}