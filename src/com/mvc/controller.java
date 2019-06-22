package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
	@RequestMapping("/First")
	public String forward() {
		return "first";
	}

	@RequestMapping("/second")
	public String display() {
		return "second";
	}

}
