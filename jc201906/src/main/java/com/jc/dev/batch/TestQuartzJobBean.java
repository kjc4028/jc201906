package com.jc.dev.batch;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class TestQuartzJobBean extends QuartzJobBean{

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		
		//���� �ð�
		long curtime = System.currentTimeMillis();
		SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String date = timeFormat.format(new Date(curtime));
		System.out.println(">>> Quartz Job bean ����..." + date);
		System.out.println(">>> Quartz Job bean �Ϸ�..."+ date);
	}


}
