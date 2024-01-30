package things;

import java.util.Comparator;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bank  implements Comparable<Bank>{
	
	
	private String name;
	private int age;
	private double amount;
	
	private Date date;
	
	Object b=new Object();
//	@Override
//	public int compareTo(Bank o) {
//		
//		return this.age-o.age;
//	}
	@Override
	public int compareTo(Bank o) {
		
		return  Double.compare(this.amount,o.amount);
	}
	

}
