package runner;

import things.Demo;

public class DemoR {

	public static void main(String[] args) {
         Demo d=new Demo();
			
			  d.addMovies("ugram"); d.addMovies("rathavar"); d.addMovies("googly");
			  d.addMovies("ramachari"); d.addMovies("ghost"); d.addMovies("rajhuli");
			  d.display();
			  
	     System.out.println("====update movie name are===");
         d.update("ugram", "raj");
         d.display();
         System.out.println("====delete movie name are===");
         d.delete("raj");
         d.display();
	}

}
