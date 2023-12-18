package string;

public class ReverseString {

	public static void main(String[] args) {
		String s = "ravikumar";
		char[] charArray = s.toCharArray();
		int n = 0;
		int e = s.length() - 1;
		while (n < e) {
			
 			char temp = charArray[n];
			charArray[n] = charArray[e];
			charArray[e] = temp;
			n++;
			e--;
		}
		System.out.println(charArray);
	}

}
