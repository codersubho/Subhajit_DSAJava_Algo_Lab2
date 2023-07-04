package com.DS.services;

public class Transaction_Service_Implementation {
      public static void search(int target, int arr[]) {
    	  int i=0;
    	  while(target>0 && i<arr.length) {
    		 target=target-arr[i];
    		 i++;
    	  }
    	  if(target<=0)
    	     System.out.println("Target achieved after "+i+ " transactions");
    	  else
    		  System.out.println("Target not achieved");
    	  
      }
}
