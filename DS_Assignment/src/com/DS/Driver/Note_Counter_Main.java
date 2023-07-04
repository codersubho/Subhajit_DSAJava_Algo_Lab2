package com.DS.Driver;
import java.util.Scanner;

import com.DS.services.Note_Services;
public class Note_Counter_Main {

	public static void main(String[] args) {
		int currencyarr[];
		int size,amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many currency denominations are there ? Please Enter");
		size= sc.nextInt();
		currencyarr = new int[size];
		System.out.println("Enter currency denomination values");
		for(int i=0;i<size;i++) {
			currencyarr[i]=sc.nextInt();		
		}
	    System.out.println("Enter the amount to be paid");
	    amount=sc.nextInt();
	   Note_Services.min_note_counter(currencyarr, amount);
        sc.close();
}
}
