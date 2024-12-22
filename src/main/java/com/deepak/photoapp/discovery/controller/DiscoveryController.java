package com.deepak.photoapp.discovery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/discovery")
public class DiscoveryController {

	@GetMapping("/status/check")
	public String getStatus() {
		return "Working...";
	}
}
