package runner;

import things.CharArray;

public class charArrayR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharArray t	=new CharArray();
		System.out.println("array insert");
		t.insert('A');
		t.insert('C');
		t.insert('b');
		t.insert('r');
		t.display();
		System.out.println("array update");
		t.updateGame('C', 'c');
		t.display();
		System.out.println("array delete");
		t.delete('b');
		t.display();

	}

}
