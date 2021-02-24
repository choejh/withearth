package com.withearth.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OnlyMemberPageController {

	@GetMapping(value="/member/useronly/testfile")
	public String onlymember() {
		return "/useronly/testfile";
	}
}
