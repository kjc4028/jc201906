package com.jc.dev.svc.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.jc.dev.svc.dao.SvcDao;
import com.jc.dev.svc.vo.SvcVo;

@Repository
public class SvcDaoImpl implements SvcDao {
	
	@Inject
	private SqlSessionTemplate sqlSession;

	
	@Override
	public List<SvcVo> selectSvcList() {
		return sqlSession.selectList("svc.selectSvcList");
	}

	@Override
	public void insertSvc(SvcVo svcVo) {
		sqlSession.insert("svc.insertSvc", svcVo);
	}

}
