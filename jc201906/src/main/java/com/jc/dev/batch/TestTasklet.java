package com.jc.dev.batch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class TestTasklet implements Tasklet {

	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		
		System.out.println(">>>�׽�Ʈ ��ġ �۾� ����...");
		//���ϴ� �۾� �ۼ� ����
		System.out.println(">>>�׽�Ʈ ��ġ �۾� �Ϸ�...");
		return RepeatStatus.FINISHED;
	}

}
