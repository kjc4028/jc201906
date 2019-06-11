package com.jc.dev.batch;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class TestQuartzJobBean extends QuartzJobBean{

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		
		//현재 시간
		long curtime = System.currentTimeMillis();
		SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String date = timeFormat.format(new Date(curtime));
		System.out.println(">>> Quartz Job bean 시작..." + date);
		System.out.println(">>> Quartz Job bean 완료..."+ date);
	}


}
