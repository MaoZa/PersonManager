package com.hxzy.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxzy.mapper.TbPayMapper;
import com.hxzy.pojo.TbPay;
import com.hxzy.pojo.TbPayExample;
import com.hxzy.pojo.TbPayExample.Criteria;
import com.hxzy.service.TbPayService;
import com.hxzy.utils.TimeUtils;

@Service
public class TbPayServiceImpl implements TbPayService {

	@Autowired
	private TbPayMapper tbPayMapper;
	
	@Override
	public List<TbPay> queryPay() {
		return tbPayMapper.selectByExample(null);
	}
	
	@Override
	public int insertPay(TbPay pay) {
		pay.setPayMonth(TimeUtils.getPayFormatDate(new Date()));
		return tbPayMapper.insertSelective(pay);
	}
	
	@Override
	public int deletePay(Integer id) {
		return tbPayMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<TbPay> queryPayByTime(String pay_month) {
		TbPayExample tbPayExample = new TbPayExample();
		tbPayExample.createCriteria().andPayMonthEqualTo(pay_month);
		return tbPayMapper.selectByExample(tbPayExample);
	}

	@Override
	public List<TbPay> queryPayByEmnumber(String pay_emnumber) {
		TbPayExample tbPayExample = new TbPayExample();
		tbPayExample.createCriteria().andPayEmnumberEqualTo(pay_emnumber);
		return tbPayMapper.selectByExample(tbPayExample);
	}
}
