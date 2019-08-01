package com.nakanobu.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class MyApp1Controller {
	@RequestMapping("/")
	public String index() {
		return index();
		
}
}
