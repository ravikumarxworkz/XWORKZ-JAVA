package string;

public class Demo {

	public static void main(String[] args) {

		
		Demo d= new Demo();
		System.out.println(d);
		System.out.println(d.toString());
		
		System.out.println("==========");
		System.out.println(d.hashCode());
		System.out.println("==========");
		
		Demo d1= new Demo();
		Demo d2= new Demo();
		System.out.println(d1.equals(d2));
		
	}

}
