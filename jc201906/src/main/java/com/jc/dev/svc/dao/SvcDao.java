package com.jc.dev.svc.dao;

import java.util.List;

import com.jc.dev.svc.vo.SvcVo;

public interface SvcDao {
	
	public List<SvcVo> selectSvcList();
	
	public void insertSvc(SvcVo svcVo);
}
