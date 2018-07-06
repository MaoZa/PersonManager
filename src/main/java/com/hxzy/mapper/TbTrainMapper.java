package com.hxzy.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.hxzy.pojo.TbTrain;
import com.hxzy.pojo.TbTrainExample;

public interface TbTrainMapper {
    int countByExample(TbTrainExample example);

    int deleteByExample(TbTrainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbTrain record);

    int insertSelective(TbTrain record);

    List<TbTrain> selectByExampleWithBLOBs(TbTrainExample example);

    List<TbTrain> selectByExample(TbTrainExample example);

    TbTrain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbTrain record, @Param("example") TbTrainExample example);

    int updateByExampleWithBLOBs(@Param("record") TbTrain record, @Param("example") TbTrainExample example);

    int updateByExample(@Param("record") TbTrain record, @Param("example") TbTrainExample example);

    int updateByPrimaryKeySelective(TbTrain record);

    int updateByPrimaryKeyWithBLOBs(TbTrain record);

    int updateByPrimaryKey(TbTrain record);
}