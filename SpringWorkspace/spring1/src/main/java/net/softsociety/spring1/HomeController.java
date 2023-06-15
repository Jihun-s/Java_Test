package net.softsociety.spring1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Getter;

@Controller
public class HomeController {
	
	@GetMapping({"", "/"})
	public String home() {
		return "index";
	}
	
	@GetMapping("imgtest")
	public String test1() {
		System.out.println("test1() 실행");
		return "img";
	}
	
	@GetMapping("jstest")
	public String test2() {
		System.out.println("test2() 실행");
		return "js";	//경로는 templates 시작
	}
	
	@GetMapping("calculator")
	public String calculate() {
		System.out.println("Calculate() 실행");
		return "김지훈";
	}
} 
