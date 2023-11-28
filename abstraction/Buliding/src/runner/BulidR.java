package runner;

import abstracts.Bulid;
import abstractsImplementation.BulidI;

public class BulidR {

	public static void main(String[] args) {

		
		Bulid b = new BulidI();
		String[] material1= {"cement","sand","steel"};
		b.bulidingName();
		b.materilas(material1);
		b.numberOffloors();
		b.painting();
		b.totalAmount();
		
	}

}
