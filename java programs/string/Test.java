package string;

public class Test {

	public static void main(String[] args) {

		String s="my name is ram";
      
		// 1. empty representation of a string object
		String s1=new String();
		System.out.println(s1);
		System.out.println("=======");
		
		//2.passing set of charcters
		String s2=new String("INDIA");
		System.out.println(s2);
		System.out.println("=======");
		//3. CONVETING CHAR[] INTO STRING
		char[] ch= {'i','n','d','i','a'};
		String s3=new String(ch);
		System.out.println(s3);
		System.out.println("=======");
		System.out.println(s.startsWith("my"));
		System.out.println("=======");
		System.out.println(s.endsWith("ram"));
		System.out.println("=======");
		System.out.println(s.contains("i"));
		System.out.println("=======");
		System.out.println(s.concat(" and im from belagavi"));
		System.out.println("=======");
		System.out.println(s.charAt(5));
		System.out.println("=======");
		System.out.println(s.indexOf('m'));
		System.out.println("===equals===");
		String e="java";
		String f="JAVA";
		String g="java";
		System.out.println(e.equals(f));
		System.out.println(e.equals(g));
		System.out.println(e.equalsIgnoreCase(f));
		System.out.println(e.equals(f));
		System.out.println("===sub string===");
		System.out.println(s.substring(3));
		System.out.println(s.substring(5, 10));
		System.out.println(s.subSequence(5, 10));
	}

}
