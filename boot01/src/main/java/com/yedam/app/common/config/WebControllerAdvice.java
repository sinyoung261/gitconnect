package com.yedam.app.common.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice //모든 컨트롤러가 동작할 때 받아야할 보조 기능
public class WebControllerAdvice {

	@ModelAttribute("contextPath")
	public String contextPath
			(final HttpServletRequest request) {
		return request.getContextPath();
		//${pageContext.request.contextPath}
	}
/*	
	@ExceptionHandler //하나만 처리하는 경우 매개변수 기반으로 선언
	public ResponseEntity<String> handle(IOException ex){
		
	}
	*/
}
