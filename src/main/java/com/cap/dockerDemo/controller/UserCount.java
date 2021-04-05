package com.cap.dockerDemo.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserCount {
	
	@GetMapping("welcome")
	public String getWelcomeMsg(@PathParam("name") String name) {
		return "Welcome "+name;
	}

}
