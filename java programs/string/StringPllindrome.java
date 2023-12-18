package string;

public class StringPllindrome {
	public static void main(String[] args) {

		String s = "EYe";
		String reversed = "";

		for (int i = 0; i < s.length(); i++) {
			reversed = s.charAt(i) + reversed;
		}
		if (s.equalsIgnoreCase(reversed)) {
			System.out.println(" given word is pallindrome");
		} else {
			System.out.println(" given word is not pallindrome");
		}

	}
}
