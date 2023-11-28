
package runner;

import things.Democurd;

public class DemoCurdR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Democurd d = new Democurd();
		System.out.println("add name and display");
		String[] name= {"RAVI","SOMA","SUDHI","VENKI"};
		d.insert(name);
		d.display();
		System.out.println("UPDATE THE NAME AND DISPALAY");
		String[] oldName= {"RAVI","SOMA","SUDHI","VENK"};
		String[] newName= {"ravi",null,"RAMESH","SUNIL"};
		d.update(oldName,newName);
		d.display();
		System.out.println("delete names and dispaly");
		String[] deleteName= {null,null,"RAMESH","SUNIL"};
		d.delete(deleteName);
		d.display();
		
	}

}
