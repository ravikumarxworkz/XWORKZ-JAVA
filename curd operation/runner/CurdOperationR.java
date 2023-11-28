package runner;

import things.CurdOperation;

public class CurdOperationR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           CurdOperation co=new CurdOperation();
           System.out.println("country names are");
           co.insertData("INDIA");
           co.insertData("SPAIN");
           co.insertData("GERMANY");
           co.insertData("ITALY");
           co.displayData();
          System.out.println("after update old country name to new country name ");
           co.updateData("SPAIN", "USA");
           co.displayData();
           System.out.println("delete one country name");
           co.deleteData("USA");
          co.displayData();
       
           
	}

}
