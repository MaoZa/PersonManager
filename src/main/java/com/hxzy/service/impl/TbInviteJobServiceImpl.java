package com.hxzy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxzy.mapper.TbInvitejobMapper;
import com.hxzy.pojo.TbInvitejob;
import com.hxzy.pojo.TbInvitejobExample;
import com.hxzy.pojo.TbInvitejobExample.Criteria;
import com.hxzy.service.TbInviteJobService;

@Service
public class TbInviteJobServiceImpl implements TbInviteJobService {

	@Autowired
	TbInvitejobMapper tbInvitejobMapper;
	public List<TbInvitejob> queryInviteJob() {
		return tbInvitejobMapper.selectByExample(null);
	}
	public TbInvitejob queryOneInviteJob(int id) {
		return tbInvitejobMapper.selectByPrimaryKey(id);
	}
	@Override
	public int insertInviteJob(TbInvitejob invitejob) {
		return tbInvitejobMapper.insertSelective(invitejob);
	}

	@Override
	public List<TbInvitejob> queryInviteJobByIsstock(int isstock) {
		TbInvitejobExample example = new TbInvitejobExample();
		Criteria criteria = example.createCriteria();
		criteria.andIsstockEqualTo(isstock);
		return tbInvitejobMapper.selectByExample(example);
	}
	@Override
	public void removeInviteJobById(int id) {
		tbInvitejobMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public void updateInviteJobIsstock(TbInvitejob tbInvitejob, int isstock) {
		tbInvitejob.setIsstock(isstock);
		tbInvitejobMapper.updateByPrimaryKey(tbInvitejob);
	}
	
}
