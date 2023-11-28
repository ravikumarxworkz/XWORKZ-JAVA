package runner;

import things.ArrayInsert;

public class ArrayInsertR {

	public static void main(String[] args) {
		ArrayInsert s=new ArrayInsert();
		// here single variable assign and display
		s.insertData1("coccount");
		s.insertData1("cooking oil");
		s.insertData1("salt");
		s.insertData1("spicy");
		s.insertData1("turmeri");
		s.insertData1("pepper");
		s.displayProductList();
		// here assign array and displaying arrays parameter
		String[]p={"rice","tea","coffe","sugar","lemon","ginger"};
		s.insertData(p);
		s.displayProductList();
	}
	
}
