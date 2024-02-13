package com.xworkz.scam.runner;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.scam.dto.ScamDto;

public class ScamRunner {
	
	
	
	
	public static void main(String[] args) {
		
		ScamDto s=new ScamDto("psi545Exam", "policeDepartment","r.d.patil", 50000);
		ScamDto s1=new ScamDto("ctiexam", "kpsc","DKS", 90000);
		ScamDto s2=new ScamDto("coviddose","Health minstry","dr shudhakar", 62455200.10);
		ScamDto s3=new ScamDto("vijya mayalla scam","sbi bank", "vijya mayalla", 90000.00);
		
		
	//	List<ScamDto> list=new ArrayList<ScamDto>();
		
		
			Class<?> c=Object.class;
			 Method[] m=c.getDeclaredMethods();
			 int i=0;
			 for (Method method : m) {
				System.out.println(method.getDeclaringClass());
			//	System.out.println(method.ge);
				i++;
		
			 }
			 System.out.println(i);
		
//		list.add(s);
//		list.add(s1);
//		list.add(s2);
//		list.add(s3);
//		
//		list.sort(Comparator.comparing(ScamDto::getScamedAmount));
//		
//		System.out.println(list);
	}

}
