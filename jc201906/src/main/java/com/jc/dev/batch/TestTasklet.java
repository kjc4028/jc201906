package com.jc.dev.batch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class TestTasklet implements Tasklet {

	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		
		System.out.println(">>>테스트 배치 작업 시작...");
		//원하는 작업 작성 영역
		System.out.println(">>>테스트 배치 작업 완료...");
		return RepeatStatus.FINISHED;
	}

}
