package things;

public class Demo {

	String[] movieList = new String[5];
	int i = 0;

	public void addMovies(String movieNames) {

		if (i < movieList.length) {
			movieList[i] = movieNames;
			i++;
		} 
		else {
			System.out.println("movie list is full");
		
		}
	}
	public void update(String oldName, String newName) {
		for (int i = 0; i < movieList.length; i++) {
			if(movieList[i]==oldName) {
				movieList[i]=newName;
				break;
			}
			else {
				System.out.println("not found");
				break;
			}
		}
		
	}
	public void delete(String movieName) {
		for (int i = 0; i < movieList.length; i++) {
			if(movieList[i]==movieName) {
				movieList[i]=null;
			 break;
			}
			if(i==(movieList.length-1)) {
				System.out.println("not exist");
			}
		}
	}

	public void display() {
		for (int j = 0; j < movieList.length; j++) {
			if (movieList[j] == null) {
				System.out.println("movie "+(j+1)+" delteled");
			}
			if (movieList[j] != null) {
				System.out.println("movie "+(j+1)+" "+movieList[j]);
			}
		}
	}
}
