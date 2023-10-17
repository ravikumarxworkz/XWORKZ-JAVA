package com.things;

public class CurdOperation {
	
	int index=0;
	 String[] countryList=new String[4];
	public void insertData(String countryName) {
		if(index<countryList.length) {
			countryList[index]=countryName;
			index++;
		}
		else {
			System.out.println("country list is full");
		}
	}
    public  void displayData() {
    	 for(int i=0; i<countryList.length; i++) {
     		 if(countryList[i]!=null) {
	         System.out.println((i+1)+")"+countryList[i]);
	 }
    	}
    }	 
    public  void updateData(String oldName ,String newName) {
    	 for(int j=0; j<countryList.length; j++) {
    		 if(countryList[j]==oldName) {
    			 countryList[j]=newName;
                    break;
    		 }
    	 }
    }
    	public void deleteData(String deleteName) {
    		 for(int j=0; j<countryList.length; j++) {
        		 if(countryList[j]==deleteName) {
        			 countryList[j]=null;
                        break;
        		 }
        		 if(j==(countryList.length-1)){
        			 System.out.println("country name is not exist");
        	 }
    	}
     }
}
