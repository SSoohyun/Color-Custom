package org.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/member/*")
public class MainController {
	
	 @GetMapping("/join") 
	 public void viewHeader(){
	  log.info("join");
	  }
	 @GetMapping("/login") 
	 public void viewFooter(){
	  log.info("login");
	  }
	 
	 
}