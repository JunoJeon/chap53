package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Country {
	String 	code2;
	Integer capital;
	String 	head_of_state;
	String 	government_form;
	String  local_name;
	Integer gnp_old;
	Integer gnp;
	Double  life_expectancy;
	Integer population;
	Integer indep_year;
	Integer surface_area;
	String 	region;
	String 	continent;
	String 	name;
	String 	code;
}
