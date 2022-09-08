package com.gura.lug;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	//home.do 요청이 왔을때 동작하는 컨트롤 메소드
	@RequestMapping("/home.do")
	public String home(HttpServletRequest request) {
		
		
		return "home";
	}
	
}
