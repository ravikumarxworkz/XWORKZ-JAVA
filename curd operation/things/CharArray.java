package things;

public class CharArray {
	int index = 0;
	char[] ch = new char[4];

	public void insert(char chName) {
		if (index < ch.length) {
			ch[index] = chName;
			index++;
		}
		else {
			System.out.println("trainee name are full");
		}
	}
	public void updateGame(char oldChar,char newChar) {
		for(int x=0; x<ch.length; x++) {
			if(ch[x]==oldChar) {
				ch[x]=newChar;
				break;
			}
		}
	}
		public void delete(char charName) {
			for(int i=0; i<ch.length; i++) {
				if(ch[i]==charName) {
					ch[i]='0';
				 break;
				}
				if(i==(ch.length-1)) {
					System.out.println("not exist");
				}
			
		}
	}
	public void display() {
		for (int j = 0; j < ch.length; j++) {
			System.out.println("char words=" + ch[j]);
		}
	}

}
