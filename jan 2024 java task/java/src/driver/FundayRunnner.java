package driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import things.FunDay;

public class FundayRunnner {
	
	
	
	public static void main(String[] args) {
		
		FunDay day =new FunDay();
		FunDay day1 =new FunDay();
		FunDay day2 =new FunDay();
		
		
       day.setName("funfriday");
       day.setDay("firday");
       day.setTimings("5.00pm");
       day.setLocation("office");
       day.setTheme("dance");
       day.setCoordinator("ramesh");
       
       day1.setName("funsong");
       day1.setDay("wensday");
       day.setTimings("5.00pm");
       day1.setLocation("online");
       day1.setTheme("song");
       day1.setCoordinator("venki");
       
       day2.setName("funsunday");
       day2.setDay("sunday");
       day.setTimings("5.00pm");
       day2.setLocation("ground");
       day2.setTheme("game");
       day2.setCoordinator("soma");
       
       
       List<FunDay> list =new ArrayList<FunDay>();
       
       list.add(day);
       list.add(day1);
       list.add(day2);
       
     
       ListIterator<FunDay> li= list.listIterator();
       
       while(li.hasNext()) {
    	   
    	   System.out.println(" pervious iundex:"+li.previousIndex());
    	   System.out.println(" pervious iundex:"+li.nextIndex());
    	   System.out.println("reading elements:"+li.next());
    	   
    	   if(li.hasNext()) {
    		   System.out.println("reading previous elements:"+li.previous());
    	   }
       }
		
		
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}

}
