package com.things;

import java.util.Date;

public class Telegram {
		public String name;
		public String userName; 
		public String password;
		public long phoneNumber;
		public String dob;
		public char gender;
		public String adress;
		public String profileType;
		public  Date date ;

		 public Telegram() {
			this("s/o shankar kumbar,ugar budruk,belagavi karnataka-591316","personal" ,new Date());
	     System.out.println("welcome to Telegram");
		}
		public Telegram(String name) { //1
			this.name=name;
			System.out.println("name="+this.name);
		}

		public Telegram(String userName,String password) {//2
		this("Ravikumar");
	     this.userName=userName;
	     this.password=password;
	     System.out.println("username="+this.userName+"\n"+"password="+this.password);
		}
		public Telegram(long phoneNumber) {//3
			this("Ravi7862","Ravikumar@7862");
			this.phoneNumber=phoneNumber;
			System.out.println("phoneNumber="+this.phoneNumber);
		}
		public Telegram(String dob,char gender) {//4
			this(8123179157l);
		    this.dob=dob;
		    this.gender=gender;
		    System.out.println("date of birth="+this.dob+"\n"+"gender="+this.gender);
			}
			public Telegram(String adress,String profileType, Date date) {//5
				this("01/01/1997",'M');
				this.adress=adress;
				this.profileType=profileType;
				this.date=date;
				System.out.println("adress="+this.adress+"\n"+"profileType="+this.profileType+"\n"+"date="+date);
			}

}
