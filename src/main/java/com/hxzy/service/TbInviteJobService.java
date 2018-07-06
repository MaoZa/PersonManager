package com.hxzy.service;

import java.util.List;

import com.hxzy.pojo.TbInvitejob;

public interface TbInviteJobService {
	public List<TbInvitejob> queryInviteJob();
	public TbInvitejob queryOneInviteJob(int id);
	/**
	 * 添加应聘人信息
	 * @param invitejob
	 * @return
	 */
	public int insertInviteJob(TbInvitejob invitejob);
	/**
	 * 按照是否录用查询
	 * @return
	 */
	public List<TbInvitejob> queryInviteJobByIsstock(int isstock);
	
	/***
	 * 根据ID删除招聘信息
	 * @param id
	 */
	public void removeInviteJobById(int id);
	
	/***
	 * 根据id更改录用状态
	 * @param id
	 */
	public void updateInviteJobIsstock(TbInvitejob tbInvitejob, int isstock);
}
