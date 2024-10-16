package com.rajat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/m3")
public class M3Controller {

	@GetMapping("/getDataM3/{data}")
	public String getDataM3(@PathVariable String data) {
		return "Data is "+data+" Cat";
	}
}
