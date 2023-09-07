package com.example.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmpMapperTest {
	
	@Autowired
	EmpMapper mapper;
	
	@Test
	void selectAll() {
		var list = mapper.selectAll(null);
		
		System.out.println(list);
		
	}
	
}
