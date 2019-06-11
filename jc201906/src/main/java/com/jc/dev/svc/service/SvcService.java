package com.jc.dev.svc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jc.dev.svc.dao.SvcDao;
import com.jc.dev.svc.vo.SvcVo;

@Transactional
@Service
public class SvcService {
	
	@Autowired
	private SvcDao svcDao;
	
	public List<SvcVo> selectSvcList() throws Exception{
		return svcDao.selectSvcList();
	}
	
	public void insertSvc(SvcVo svcVo) throws Exception{
		svcDao.insertSvc(svcVo);
	}

}
