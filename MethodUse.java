import java.util.Scanner;

public class MethodUse {
 void add(int a, int b) {
	int sum=a+b;
	System.out.println("sum of two number ="+sum);
}
 static void sub(int a, int b) {
	int sub=a-b;
	System.out.println("sum of two number ="+sub);
}
 static int multiple(int a, int b) {
	return a*b;
}
  int dispaly() {
	return 100;
}
public static void main(String[] args) {
	MethodUse a1=new MethodUse();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value of a");
	int a=sc.nextInt();
	System.out.println("enter value of b");
	int b=sc.nextInt(); 
	a1.add(a, b);
	sub(a, b);
	int z=multiple(a, b);
	System.out.println(z);
	System.out.println(a1.dispaly());
	sc.close();
}
}
