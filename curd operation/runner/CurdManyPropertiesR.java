package runner;

import java.util.Scanner;

import things.CurdManyProperties;

public class CurdManyPropertiesR {

	public static void main(String[] args) {

		CurdManyProperties C = new CurdManyProperties();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of all properties");
		int size = sc.nextInt();
		String iplT[] = new String[size];
		String captainN[] = new String[size];
		String homeG[] = new String[size];
		int noOfPlayer[] = new int[size];
		System.out.println("enter  ipl team names :");
		for (int i = 0; i < iplT.length; i++) {
			iplT[i] = sc.next();
		}
		System.out.println("enter  captain names :");
		for (int i = 0; i < captainN.length; i++) {
			captainN[i] = sc.next();
		}
		System.out.println("enter  home ground name :");
		for (int i = 0; i < homeG.length; i++) {
			homeG[i] = sc.next();
		}
		System.out.println("enter  no of players in the team :");
		for (int i = 0; i < noOfPlayer.length; i++) {
			noOfPlayer[i] = sc.nextInt();
		}
		C.insert(iplT, captainN, homeG, noOfPlayer);

		C.display();
	}

}
//System.out.println("array elements are :");
//for (String i : iplT) {
//	System.out.println(i);
//}
// {"RCB","CSK","MI","GT","LSG"};
//String captainN[] = {"KHOLI","RHOIT","DHONI","PANDY","RAHUL"};
//String homeG[] = {"BENGALURU","MUMBAI","CHANAI","GUJRAJ","LUCKNOW"};
//int noOfPlayer[]= {20,50,40,50,52};