package com.DS.services;

public class Sorter {
    static int arr[];
	public void sort() {
		int size,i,k,j;
	   	 size=arr.length;
	   	 boolean already_sorted;
	   	 for(i=0;i<size-1;size--) {
	   		 already_sorted=true;
	   		 
	   		 for(j=i;j<size-1;j++) {
	   			 k=j+1;
	   			 if(arr[j]<arr[k]) {
	   				 already_sorted=false;
	   				 arr[j]=arr[j]+arr[k]-(arr[k]=arr[j]); //This one line of code is used for swapping
	   			     
	   		        }
	   			 
	   			 }
	   	 if(already_sorted) {
	  		  break;
	   	    }
	   	}
    }
}
