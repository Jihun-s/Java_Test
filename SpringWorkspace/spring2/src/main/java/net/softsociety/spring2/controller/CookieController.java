package net.softsociety.spring2.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("ck")
public class CookieController {

	@GetMapping("cookie1")
	//클라이언트에 대답을 할 수 있는 객체
	public String cookie1(HttpServletResponse res) {
		//쿠키생성
		Cookie c1 = new Cookie("str", "abcde");
		Cookie c2 = new Cookie("num", "123");
		//쿠키의 종료 시점 지정
		c1.setMaxAge(60 * 60 * 24 * 3);
		c2.setMaxAge(60 * 60 * 24 * 3);
		//클라이언트로 쿠키 보내기
		res.addCookie(c1);
		res.addCookie(c2);
		
		return "redirect:/";
	}
	
	@GetMapping("cookie2")
	public String cookie2(HttpServletResponse res) {
		Cookie a = new Cookie("str", null);
		Cookie b = new Cookie("num", null);
		a.setMaxAge(0);
		b.setMaxAge(0);
		res.addCookie(a);
		res.addCookie(b);
		
		return "redirect:/";
	}
	@GetMapping("cookie3")
	public String cookie3(
			@CookieValue(name="str", defaultValue = "없음") String s
			, @CookieValue(name="num", defaultValue = "0") int num) {
		log.debug("str: {}, num: {}", s, num);
		
		return "redirect:/";
	}
	
}
