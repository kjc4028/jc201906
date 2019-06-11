package com.jc.dev.batch.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/batch")
@Controller
public class BatchController {
    @Autowired
	@Qualifier("testJob")
    private Job job;

    @Autowired
    @Qualifier("testJob2")
    private Job job2;
    
    @Autowired
    private JobLauncher jobLauncher;
    
    @RequestMapping(value="/test", method=RequestMethod.GET)
    public String testBatch() throws Exception{
    	
    	JobParametersBuilder builder = new JobParametersBuilder();
    	JobParameters jobParamerters = builder.addLong("timestamp", System.currentTimeMillis()).toJobParameters();
    	
    	jobLauncher.run(job, jobParamerters);
    	jobLauncher.run(job2, jobParamerters);
    	
    	return "/home";
    }
}
