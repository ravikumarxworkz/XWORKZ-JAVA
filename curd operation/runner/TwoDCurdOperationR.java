package runner;

import java.util.Scanner;

import things.TwoDCurdOperation;

public class TwoDCurdOperationR {

	public static void main(String[] args) {

		TwoDCurdOperation d = new TwoDCurdOperation();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of propeties");
		int z = scanner.nextInt();
		String[] properties = new String[z];
		System.out.println("enter size of values(2d array) ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		String[][] value = new String[x][y];
     	String[][] deleteN = new String[x][y];
//		String[] newN = new String[y];
//		String[] oldN = new String[y];
		System.out.println("enter the  of propeties of arrays");
		for (int i = 0; i < properties.length; i++) {
			properties[i] = scanner.next();
		}
		System.out.println("enter the values of 2d arryas ");
		for (int v = 0; v < x; v++) {
			for (int i = 0; i < y; i++) {
				value[v][i] = scanner.next();
			}
		}
		d.insertpropertie(properties);
		d.insert(value);
		d.display();
		System.out.println("enter old names");
		String oldN=scanner.next();
//			for (int i = 0; i < y; i++) {
//				oldN[i] = scanner.next();
//		}
		System.out.println("enter new names");
		String newN=scanner.next();
//		for (int v = 0; v < x; v++) {
//			for (int i = 0; i < y; i++) {
//				newN[i] = scanner.next();
//			}
//		}
		d.update(oldN, newN);
		d.display();
		System.out.println("enter delete  names");
		for (int v = 0; v < x; v++) {
			for (int i = 0; i < y; i++) {
				deleteN[v][i] = scanner.next();
			}
		}
	d.delete(deleteN);
	d.display();
  }

}
