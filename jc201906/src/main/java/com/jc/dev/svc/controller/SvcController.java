package com.jc.dev.svc.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jc.dev.svc.service.SvcService;
import com.jc.dev.svc.vo.SvcVo;

@Controller
@RequestMapping("/svc")
public class SvcController {
    
	@Autowired
	private SvcService svcServie;
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String selectSvcList(Model model) throws Exception{
		model.addAttribute("svcList", svcServie.selectSvcList());
		return "svc/svcListR";
	}
	
	@RequestMapping(value="/insert", method = RequestMethod.GET)
	public String insertSvcView(SvcVo svcVo){
		return "svc/svcCU";
	}

	@RequestMapping(value="/insert", method = RequestMethod.POST)
	public String insertSvc(SvcVo svcVo) throws Exception{
		String nowTime = new SimpleDateFormat("YYYYMMDDHHmmss").format(System.currentTimeMillis());
		String svcId2 = nowTime.substring(0, 10);
		
		svcVo.setSvcId(svcId2);
		svcVo.setUseYn("Y");
		svcVo.setDelYn("N");
		svcServie.insertSvc(svcVo);
		
		return "redirect:/svc/list";
	}
}
