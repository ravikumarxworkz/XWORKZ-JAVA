package driver;

public class PlanRunnner {

	public static void main(String[] args) {

		Plan plan = new Plan() {
			@Override
			public void buildHome() {
				System.out.println("buliding a house");
			}

		};
		plan.buildHome();
		plan.house();
	}
}         
