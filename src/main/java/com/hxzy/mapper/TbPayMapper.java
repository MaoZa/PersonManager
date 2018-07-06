package com.hxzy.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.hxzy.pojo.TbPay;
import com.hxzy.pojo.TbPayExample;

public interface TbPayMapper {
    int countByExample(TbPayExample example);

    int deleteByExample(TbPayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbPay record);

    int insertSelective(TbPay record);

    List<TbPay> selectByExample(TbPayExample example);

    TbPay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbPay record, @Param("example") TbPayExample example);

    int updateByExample(@Param("record") TbPay record, @Param("example") TbPayExample example);

    int updateByPrimaryKeySelective(TbPay record);

    int updateByPrimaryKey(TbPay record);
}