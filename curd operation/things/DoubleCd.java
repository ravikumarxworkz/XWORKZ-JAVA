package things;

public class DoubleCd {
	double [] ratings=new double[6];
	int i=0;
	public void insert(double rating) {
	
		if(i<ratings.length) {
			ratings[i]=rating;
			i++;
		
		}
			else{
				System.out.println("rating list is full");
				
			}
	}
	
		public void update(double oldRating,double newRating) {
			for(int x=0; x<ratings.length; x++) {
				if(ratings[x]==oldRating) {
					ratings[x]=newRating;
					break;
				}
			}
		}
			public void delete(double deleteRating) {
				for(int i=0; i<ratings.length; i++) {
					if(ratings[i]==deleteRating) {
						ratings[i]=0;
					 break;
					}
					if(i==(ratings.length-1)) {
						System.out.println("Rating is not exist");
					}
				
			}
		}
			public void display(){
				for(int n=0; n<ratings.length; n++) {
					if(ratings[n]!=0) {
					System.out.println("Rating is="+ratings[n]);
			}
			}
			}
}
