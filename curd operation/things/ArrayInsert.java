package things;

public class ArrayInsert {

	int index = 0;

	String[] productList = new String[5];

	/// insertion of Array with single variable parameter
	public void insertData1(String productName) {
		if (index < productList.length) {
			productList[index] = productName;
			index++;
		} else {
			System.out.println("list is full");
		}
	}

	// insertion of Array with Array parameter
	public void insertData(String[] productName) {
		int i = 0;
		for (int n = 0; n < productName.length; n++) {
			if (i < productList.length) {
				productList[i] = productName[n];
				i++;
			} else {
				System.out.println("list is full");
			}
		}
	}

	public void displayProductList() {
		for (int i = 0; i < productList.length; i++) {
			System.out.println("product name=" + productList[i]);
		}

	}
      public void updateProducts(String oldElment , String newElement) {
    	  for(int i=0;i<productList.length;i++) {
    		  if(productList[i]==oldElment) {
    			  productList[i]=newElement;
    		  }
    		  else {
    			  System.out.println("not exist");
    			  break;
    		  }
    	  }
    	  
      }
}
