package com.hxzy.service;

import java.util.List;

import com.hxzy.pojo.TbPay;

public interface TbPayService {
	
	public List<TbPay> queryPay();
	/***
	 * 添加薪资信息
	 * @param pay
	 * @return
	 */
	public int insertPay(TbPay pay);
	/***
	 * 删除薪资信息
	 * @param id
	 * @return
	 */
	public int deletePay(Integer id);
	/***
	 * 按年月查询
	 * @param pay_month
	 * @return
	 */
	public List<TbPay> queryPayByTime(String pay_month);
	
	/***
	 * 按员工编号查询
	 * @param pay_emnumber
	 * @return
	 */
	public List<TbPay> queryPayByEmnumber(String pay_emnumber);
}
