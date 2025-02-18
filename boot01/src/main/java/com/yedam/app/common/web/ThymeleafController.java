package com.yedam.app.common.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

@Controller
public class ThymeleafController {
	private EmpService empService;
	
	public ThymeleafController(EmpService empService) {
		this.empService = empService;
	}
	
	@GetMapping("thymeleaf")
	public String whymeleafTest(Model model) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(100);
		EmpVO findVO = empService.findEmpInfo(empVO);
		model.addAttribute("empInfo", findVO);
		
		List<EmpVO> list = empService.findAllEmp();
		model.addAttribute("empList", list);
		
		return "test"; //경로상 슬러시가 하나 더 들어가면 경로가 틀어지므로 넣으면 안된다
		
  }

}
