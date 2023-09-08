package com.example.model;

import org.junit.jupiter.api.Test;

public class EmpTest {
	
	@Test
	void build() {
		var emp3 = new Emp();
		emp3.setEmpno(1000);
		emp3.setEname("홍길동");
	}
}
