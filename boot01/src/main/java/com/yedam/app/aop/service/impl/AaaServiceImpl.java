package com.yedam.app.aop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yedam.app.aop.mapper.AaaMapper;
import com.yedam.app.aop.service.AaaService;
@Service  //@Transactional 사용 가능
public class AaaServiceImpl implements AaaService {
	// DB와 
	private AaaMapper empMapper;
	
	@Autowired
	AaaServiceImpl(AaaMapper aaaMapper){
		this.empMapper = aaaMapper;
	}
	
	@Transactional //트렌젝션을 제어
	@Override
	public void aaaInsert() {
		empMapper.insert("101");
		empMapper.insert("a101");
	}

}  
