package driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import things.Bank;

public class BankRunnner {
	
	
	public static void main(String[] args) {
		
		
		List<Bank> list=new ArrayList<Bank>();
		
//		list.add(new Bank("soma",28,5200.20),new Date());
//		list.add(new Bank("venki",22,5200.50),new Date());
//		list.add(new Bank("shiva",25,5100.20),new Date());
		
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
