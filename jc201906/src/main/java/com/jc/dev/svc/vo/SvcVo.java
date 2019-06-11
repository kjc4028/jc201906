package com.jc.dev.svc.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class SvcVo {

	int svcSeq;
	
	String svcId;
	
	String svcNm;
	
	String svcCts;
	
	String useYn;
	
	String delYn;
	
	Date regDh;
	
	Date modDh;

	
	
}
