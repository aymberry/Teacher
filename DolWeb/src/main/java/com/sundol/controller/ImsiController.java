package com.sundol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ImsiController {
	/*
	 * �۾��� �� ��û ó�� �Լ�
	 */
	@RequestMapping("/Imsi/ImsiWriteForm")
	public ModelAndView imsiWriteForm() {
		//	������ ���� ���� �丸 �θ���
		ModelAndView	mv = new ModelAndView();
		mv.setViewName("Imsi/ImsiWriteForm");
		return mv;
	}
}
