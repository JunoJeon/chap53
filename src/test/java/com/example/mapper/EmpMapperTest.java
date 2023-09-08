package com.example.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.model.Emp;

@SpringBootTest
public class EmpMapperTest {
	
	@Autowired
	EmpMapper mapper;
	
	@Autowired
	ApplicationContext factory;
	
	
	@Test
	void autowire() {
		assertThat(factory).isNotNull();
		var mapper = factory.getBean(EmpMapper.class);
		assertThat(mapper).isNotNull();
		System.out.println(this.mapper == mapper);
		assertThat(this.mapper).isEqualTo(mapper);
	}
	
	@Test
	void selectAll() {
		var list = mapper.selectAll();
		System.out.println(list);
		assertThat(list).isNotNull();
		assertThat(list).isNotEmpty();
		assertThat(list.size()).isEqualTo(14);
	}
	
	@Test
	void selectByDeptno() {
		var list = mapper.selectByDeptno(10);
		System.out.println(list);
		assertThat(list.size()).isEqualTo(3);
	}
	
	@Test
	void selectBySearch() {
		var list = mapper.selectBySearch(null, "");
		System.out.println(list);
		assertThat(list.size()).isEqualTo(14);
		
		list = mapper.selectBySearch(null, "사");
		System.out.println(list);
		assertThat(list.size()).isEqualTo(5);
		
		list = mapper.selectBySearch(20, "");
		System.out.println(list);
		assertThat(list.size()).isEqualTo(5);
		
	}

	
	
}
