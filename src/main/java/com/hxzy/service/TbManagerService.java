package com.hxzy.service;

import java.util.List;

import com.hxzy.pojo.TbManager;

public interface TbManagerService {
	/**
	 * 查询所有管理员
	 * @return
	 */
	public List<TbManager> queryManager();
	/**
	 * 查询用户是否登录成功
	 * @return
	 */
	public TbManager queryOneManager(String account, String password);
	/**
	 * 修改管理员密码
	 * @param manager
	 * @return
	 */
	public int updateManager(TbManager manager);
	/**
	 * 添加管理员
	 * @param manager
	 * @return
	 */
	public int insertManager(TbManager manager);
	/**
	 * 删除
	 * @param id
	 */
	public void deleteManager(Integer id);
	/**
	 * 验证用户名密码是否存在
	 * @return
	 */
	public List<TbManager> checkManager(String account, String password);
	public List<TbManager> checkManager(String account);
}
