package com.hxzy.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.hxzy.pojo.TbInvitejob;
import com.hxzy.pojo.TbInvitejobExample;

public interface TbInvitejobMapper {
    int countByExample(TbInvitejobExample example);

    int deleteByExample(TbInvitejobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbInvitejob record);

    int insertSelective(TbInvitejob record);

    List<TbInvitejob> selectByExampleWithBLOBs(TbInvitejobExample example);

    List<TbInvitejob> selectByExample(TbInvitejobExample example);

    TbInvitejob selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbInvitejob record, @Param("example") TbInvitejobExample example);

    int updateByExampleWithBLOBs(@Param("record") TbInvitejob record, @Param("example") TbInvitejobExample example);

    int updateByExample(@Param("record") TbInvitejob record, @Param("example") TbInvitejobExample example);

    int updateByPrimaryKeySelective(TbInvitejob record);

    int updateByPrimaryKeyWithBLOBs(TbInvitejob record);

    int updateByPrimaryKey(TbInvitejob record);
}