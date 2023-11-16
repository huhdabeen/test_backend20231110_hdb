package com.hk.user.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.user.dtos.HkDto;
//import com.hk.board.dtos.HkDto;
import com.hk.user.service.IHkService;

@Controller
public class HkController {
	
	@Autowired
	private IHkService hkService;
	
	@RequestMapping(value="/index.do",method=RequestMethod.GET)
	public String index(Model model) {
		System.out.println("index.do요청");
		
		return "index";
	}
	
	@RequestMapping(value="/registForm.do", method=RequestMethod.GET)
	public String insertUSer(Model model, HkDto dto) {
		System.out.println("registForm.do요청");
		
		return "registForm";
	}
	
//	@RequestMapping(value="/registForm.do", method=RequestMethod.POST)
//	public String insertUser(Model model,HkDto dto) {
//		
//		System.out.println("registForm.do요청");
//		boolean isS=hkService.insertUser(dto);
//		if(isS) {
//			return "redirect:index.do"; //"WEB-IN/views/boardList.do.jsp" -> 404   
//		}else {
//			model.addAttribute("msg","실패");
//			return "error"; //return "페이지이름"; --> viewResolver가 실행됨
//		}
//	}
	@ResponseBody
	@RequestMapping(value="/idChk.do",method= {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
	public String idChk(Model model, HkDto dto) {
		System.out.println("idChk.do요청");
		
		HkDto dto1=hkService.idCheck(dto);
		
		//model.addAttribute("dto", dto1);
		return dto1==null?"null":dto1.getId(); 
	}
	
	@RequestMapping(value="/addUser.do",method= {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
	public String addUser(Model model, HkDto dto) {
		System.out.println("addUser.do요청");
		
		boolean isS=hkService.insertUser(dto);
		if(isS) {
			return "redirect:index.do";
		}else{
			model.addAttribute("msg", "실패");
			return "registForm";
		}
	}
	
	@RequestMapping(value="/login.do",method= {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
	public String login(Model model, HkDto dto) {
		System.out.println("login.do요청");
		
		return "user_main";
	}
}





