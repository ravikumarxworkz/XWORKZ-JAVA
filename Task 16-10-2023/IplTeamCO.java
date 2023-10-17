package com.things;

public class IplTeamCO {
	int index=0;
	 String[] IplTeamList=new String[4];
	public void insertData(String teamName) {
		if(index<IplTeamList.length) {
			IplTeamList[index]=teamName;
			index++;
		}
		else {
			System.out.println("ipl team list is full");
		}
	}
   public  void displayData() {
   	 for(int i=0; i<IplTeamList.length; i++) {
    		 if(IplTeamList[i]!=null) {
	         System.out.println((i+1)+")"+IplTeamList[i]);
	 }
   	}
   }	 
   public  void updateData(String oldName ,String newName) {
   	 for(int j=0; j<IplTeamList.length; j++) {
   		 if(IplTeamList[j]==oldName) {
   			 IplTeamList[j]=newName;
                   break;
   		 }
   	 }
   }
   	public void deleteData(String deleteName) {
   		 for(int j=0; j<IplTeamList.length; j++) {
       		 if(IplTeamList[j]==deleteName) {
       			 IplTeamList[j]=null;
                       break;
       		 }
       		 if(j==(IplTeamList.length-1)){
       			 System.out.println("ipl team  name is not exist");
       	 }
   	}
    }
}
