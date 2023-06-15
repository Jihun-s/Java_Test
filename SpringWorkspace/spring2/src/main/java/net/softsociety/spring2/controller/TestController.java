package net.softsociety.spring2.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
@RequestMapping("ex")
public class TestController {

	@GetMapping("calc1")
	public String testin1() {
		return "ex/testform1";
	}
	
	@PostMapping("calc1")
	public String testsave1(
			@RequestParam(name="num1", defaultValue="0") int num1
			, @RequestParam(name="num2", defaultValue="0") int num2
			, Model m) {
	    int sum = num1 + num2;
	    log.debug("{} + {} = {}", num1, num2, sum);

	    m.addAttribute("sum", sum);
	    m.addAttribute("num1", num1);
	    m.addAttribute("num2", num2);
	    return "ex/result";
	}
	//쿠키 체크 & 카운트
	@GetMapping("showForm")
	public String cookie1(HttpServletResponse response,
	        @CookieValue(name = "id", defaultValue = "") String id,
	        @CookieValue(name = "count", defaultValue = "0") int count1
	        ,Model model) {

	    if (count1 == 0) {
	        return "ex/testlogin1";
	    } else {
	        count1++;
	        Cookie countCookie = new Cookie("count", String.valueOf(count1));
	        countCookie.setMaxAge(60 * 60 * 5); // 5시간 동안 유지
	        response.addCookie(countCookie);
	        model.addAttribute("id", id);
	        model.addAttribute("count", count1);
	        log.debug(id);
	        log.debug(String.valueOf(count1));
	        return "ex/cookieOutput";
	    }
	}
	//첫 방문시 아이디 입력받기
	@PostMapping("cookie")
	public String cookie2(HttpServletResponse response, String testID, Model model) {
	    if(testID == null||testID.isEmpty()) {
	    	return "ex/testlogin1";
	    }
		Cookie idCookie = new Cookie("id", testID);
	    idCookie.setMaxAge(60 * 60 * 5); // 5시간 동안 유지
	    response.addCookie(idCookie);
	    Cookie countCookie = new Cookie("count", "1");
	    countCookie.setMaxAge(60 * 60 * 5); // 5시간 동안 유지
	    response.addCookie(countCookie);
	    return "redirect:/";
	}
	//쿠키 삭제
	@GetMapping("deleteCookie")
	public String deleteCookie(HttpServletResponse response) {
	    Cookie idCookie = new Cookie("id", "");
	    idCookie.setMaxAge(0);
	    response.addCookie(idCookie);

	    Cookie countCookie = new Cookie("count", "0");
	    countCookie.setMaxAge(0);
	    response.addCookie(countCookie);

	    return "redirect:/";
	}

}
