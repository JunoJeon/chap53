package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.model.Emp;

@Mapper
public interface EmpMapper {
	
	@Select("""
			select * 
				from emp
			   where 
			   		 empno like '%${search}%' OR
			   		 ename like '%${search}%' OR
			   		 gender like '%${search}%'OR
			   		 job like '%${search}%'	  OR
			   		 mgr like '%${search}%'	  OR
			   		 hiredate like '%${search}%' OR
			   		 sal like '%${search}%' OR
			   		 comm like '%${search}%' OR
			   		 deptno like '%${search}%'
			""")
	List<Emp> selectAll(String search);
}
