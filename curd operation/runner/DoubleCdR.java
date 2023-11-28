package runner;

import things.DoubleCd;

public class DoubleCdR {

	public static void main(String[] args) {
		DoubleCd d = new DoubleCd();
		System.out.println(" dispalying the ratings after  insert");
		d.insert(20.5);
		d.insert(97.5);
		d.insert(30.2);
		d.insert(55.9);
		d.display();
		System.out.println("dispalying ratings after updated");
		d.update(30.9, 99.5);
		d.display();
		System.out.println("dispalying ratings  after deleted");
		d.delete(55.9);
		d.display();
	}

}
