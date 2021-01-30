package com.telusko;

import java.lang.System;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public void add()
	{
		string ver = SpringVersion.getVersion();
		System.out.println("I am here");
		System.out.println(ver);
	}
}
