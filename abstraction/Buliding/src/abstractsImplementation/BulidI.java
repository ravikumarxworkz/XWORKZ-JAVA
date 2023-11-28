package abstractsImplementation;

import abstracts.Bulid;

public class BulidI extends Bulid {

	@Override
	public void bulidingName() {
                 System.out.println("Ram-laxman Nivas");		
	}

	@Override
	public String[] materilas( String[] material) {
		
		return material;
	}

	@Override
	public int numberOffloors() {
		System.out.println("numberOffloors");
		return 4;
	}

	@Override
	public void painting() {
		System.out.println("painting");
		
	}

	@Override
	public double totalAmount() {
		System.out.println("total amount");
		return 0;
	}

}
