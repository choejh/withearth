package com.withearth.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.withearth.community.service.MatzipListService;

@Controller
public class MatzipListController {
	
	@Autowired
	private MatzipListService matListService;
	
	@RequestMapping("/comm/matlist")
	public String getMatList(Model model) {
		
		model.addAttribute("matlist", matListService.getListView());
		
		return "comm/matlist";
	}
	
}