package things;

public class IntCd {
	int[] numbers=new int[6];
	int i=0;
	public void insert(int number) {
	
		if(i<numbers.length) {
			numbers[i]=number;
			i++;
		
		}
			else{
				System.out.println("number list is full");
				
			}
	}
	
		public void update(int oldNum,int newNum) {
			for(int x=0; x<numbers.length; x++) {
				if(numbers[x]==oldNum) {
					numbers[x]=newNum;
					break;
				}
			}
		}
			public void delete(int deleteNum) {
				for(int i=0; i<numbers.length; i++) {
					if(numbers[i]==deleteNum) {
						numbers[i]=0;
					 break;
					}
					if(i==(numbers.length-1)) {
						System.out.println("number is not exist");
					}
				
			}
		}
			public void display(){
				for(int n=0; n<numbers.length; n++) {
					if(numbers[n]!=0) {
					System.out.println("number is="+numbers[n]);
			}
			}
			}
}
