package com.mpokket.util;
/**
 * 
 * @author avadhut
 *
 */
public enum EndPoints {
	
	CREATE_EMPLOYEE("/create"),
	GET_SINGLE_EMPLOYEE("/employee/{empid}"),
	DELETE_SINGLE_EMPLOYEE("/delete/{empid}");
	
	String label;
	EndPoints(String label) {
		this.label=label;
	}
	public String getLabel() {
		return label;
	}
	
}
