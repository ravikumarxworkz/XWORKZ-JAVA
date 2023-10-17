package com.things;

public class EngineeringCO {
	int index=0;
	 String[] engineeringBranchList=new String[4];
	public void insertData(String branchName) {
		if(index<engineeringBranchList.length) {
			engineeringBranchList[index]=branchName;
			index++;
		}
		else {
			System.out.println("branch  list is full");
		}
	}
   public  void displayData() {
   	 for(int i=0; i<engineeringBranchList.length; i++) {
    		 if(engineeringBranchList[i]!=null) {
	         System.out.println((i+1)+")"+engineeringBranchList[i]);
	 }
   	}
   }	 
   public  void updateData(String oldName ,String newName) {
   	 for(int j=0; j<engineeringBranchList.length; j++) {
   		 if(engineeringBranchList[j]==oldName) {
   			 engineeringBranchList[j]=newName;
                   break;
   		 }
   	 }
   }
   	public void deleteData(String deleteName) {
   		 for(int j=0; j<engineeringBranchList.length; j++) {
       		 if(engineeringBranchList[j]==deleteName) {
       			 engineeringBranchList[j]=null;
                       break;
       		 }
       		 if(j==(engineeringBranchList.length-1)){
       			 System.out.println("branch name is not exist");
       	 }
   	}
    }

}
