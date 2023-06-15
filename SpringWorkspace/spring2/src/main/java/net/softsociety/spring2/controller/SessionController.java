package net.softsociety.spring2.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

// /** + Enter... 문서 주석
/**
 * 세션 사용 테스트
 * @author Jihun
 *
 */


//해당 클래스의 모든 메서드의 경로에 ss/ 추가
@RequestMapping("ss")
@Controller
@Slf4j
public class SessionController {
	
	@GetMapping("session1")
	public String session1(HttpSession session) {
		session.setAttribute("test", "세션에 저장한 문자열");
		
		return "redirect:/";
	}
	
	@GetMapping("session2")
	public String session2(HttpSession session) {
		String s = (String) session.getAttribute("test");
		log.debug("세션의 값:{}", s);
		
		return "redirect:/";
	}
	
	@GetMapping("session3")
	public String session3(HttpSession session) {
		session.removeAttribute("test");
		
		return "redirect:/";
	}
	
	@GetMapping("login")
	public String login() {
		
		return "loginForm";
	}
	
	/**
	 * 로그인 폼에서 전달된 ID와 비밀번호를 확인하고 로그인 처리
	 * @param id 사용자가 입력한 아이디
	 * @param pw 사용자가 입력한 비밀번호
	 * @param session 세션 객체
	 * @return 이동할 경로
	 */
	@PostMapping("login")
	public String login(String id, String pw, HttpSession session) {
		String dbid = "abc";
		String dbpw = "123";
		
		if(id != null&& pw != null && dbid.equals(id) && pw.equals(dbpw)) {
			session.setAttribute("loginId", id);
			return "redirect:/";
		}else {
			return "loginForm";
		}
		
	}
	
	@GetMapping("logout")
	public String login(HttpSession session) {
		session.removeAttribute("loginId");
		
		return "redirect:/";
	}
}
