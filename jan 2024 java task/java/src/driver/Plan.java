package driver;

public interface Plan {
	
	
	void buildHome();
	
	default void house() {
		System.out.println("house interface");
	}

}
