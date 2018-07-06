package com.hxzy.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.hxzy.pojo.TbEmployee;
import com.hxzy.pojo.TbInvitejob;

public class PackTbEmployee {
	public static TbEmployee PackTbInviteJobToTbEmployee(TbInvitejob invitejob) {
		TbEmployee tbEmployee = new TbEmployee();
		tbEmployee.setEmSerialnumber(String.format("%03d", invitejob.getId()));
		tbEmployee.setEmName(invitejob.getName());
		tbEmployee.setEmSex(invitejob.getSex());
		tbEmployee.setEmAge(invitejob.getAge());
		tbEmployee.setEmAddress(invitejob.getAddress());
		tbEmployee.setEmBorn(invitejob.getBorn());
		tbEmployee.setEmTel(invitejob.getTel());
		tbEmployee.setEmCulture(invitejob.getTeachschool());
		tbEmployee.setEmAfterschool(invitejob.getAfterschool());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
		String formatDate = simpleDateFormat.format(new Date());
		tbEmployee.setEmStartime(formatDate);
		return tbEmployee;
	}
}
