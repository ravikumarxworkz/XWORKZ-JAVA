package string;

public class Char {

	public static void main(String[] args) {
            
		String myStr = "Hello";
		for (int i = 0; i < myStr.length(); i++) {
			int result = myStr.codePointAt(i);
			char ch = myStr.charAt(i);
			System.out.println("values " + ch + " is " + result);
		}
		System.out.println("codePointBefore(1) is give value of 0");
		System.out.println(myStr.codePointBefore(1));
		System.out.println("convert char arry to string");
		 char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
		    String myStr2 = "";
		    myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
		    System.out.println("Returned String: " + myStr2);
		    System.out.println(" find the planet length by using indexof()");
		    String mySt = "Hello planet earth, you are a great planet.";
		    System.out.println(mySt.indexOf("planet"));
		    System.out.println("trim");
		    String mys = "       Hello World!        ";
		    System.out.println(mys);
		    System.out.println(mys.trim());
		  }
	
	}

