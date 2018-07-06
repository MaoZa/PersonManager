package com.hxzy.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
	
	
	public static String getPayFormatDate(Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM");
		String format = simpleDateFormat.format(date);
		return format;
	}
}
