package com.testing;

import com.entity.Student;
import com.service.Service;

public class Test {
	public static void main(String[] args) {
//		object of service class
		Service s1=new Service();
//		call m1 method that is in service 
		System.out.println(s1.m1());
	}

}
