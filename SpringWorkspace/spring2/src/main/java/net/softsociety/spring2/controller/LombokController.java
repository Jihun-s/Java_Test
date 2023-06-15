package net.softsociety.spring2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;
import net.softsociety.spring2.domain.Person;

@Slf4j
@Controller
public class LombokController {
	
	@GetMapping("lom/lombok")		//마치 주소가 있는것처럼 작성 가능
	public String lombokTest() {
		System.out.println("lombokTest() 실행중");
		
		Person p = new Person();
		p.setName("김");
		System.out.println(p);
		
		return "redirect:/";		//spring2 주소로 이동. html에서의 /는 그보다 앞으로.
	}
	
	@GetMapping("lom/logger")
	public String logTest() {
		log.debug("debug로 출력");
		log.info("info로 출력");
		log.warn("warn 출력");
		log.error("error 출력");
		
		int a = 100;
		String b = "aaaaa";
		Person c = new Person();
		
		log.debug("a={}, b={}, c={}", a, b, c);
		
		return "redirect:/";
	}
	
}
