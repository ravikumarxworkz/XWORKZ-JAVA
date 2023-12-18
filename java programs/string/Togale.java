package string;

public class Togale {
	public static void main(String[] args) {
		String s1 = "MuscialNight";

		String s2 = "";

		for (int i = 0; i < s1.length(); i++) {
            
			if ((int) s1.charAt(i) >= 65 && (int) s1.charAt(i) < 97) {
				int v = (int) s1.charAt(i) + 32;
				s2 = s2 + (char) v;
			} else if ((int) s1.charAt(i) >= 97) {
				int v = (int) s1.charAt(i) - 32;
				s2 = s2 + (char) v;
			}
		}
		System.out.println(s2);
	}
}
