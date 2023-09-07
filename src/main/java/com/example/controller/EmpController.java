package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.mapper.EmpMapper;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmpController {
	
	@Autowired
	EmpMapper mapper;
	
	@GetMapping("/emp/list")
	String list(HttpServletRequest request) {
		String search = request.getParameter("search");
		
		var list = mapper.selectAll(search);
		request.setAttribute("list", list);
		
		return "emp/list";
	}
}
