package runner;

import things.IntCd;

public class IntCdR {

	public static void main(String[] args) {
		IntCd n = new IntCd ();
		System.out.println(" dispalying the numbers after  insert");
		n.insert(65);
		n.insert(97);
		n.insert(3);
		n.insert(5);
		n.display();
		System.out.println("dispalying numbers after updated");
		n.update(3, 9);
		n.display();
		System.out.println("dispalying numbers after deleted");
		n.delete('a');
		n.display();
	}

}
