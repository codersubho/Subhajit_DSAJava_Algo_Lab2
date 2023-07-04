package com.DS.Driver;
import java.util.Scanner;

import com.DS.services.Transaction_Service_Implementation;
public class Transaction_Main {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Transactions to be entered");
		System.out.println("Enter the size transaction array");
		size=sc.nextInt();
		int transac_arr[] = new int[size];
		System.out.println("Enter the transactions ");
		for(int i=0;i<size;i++)
			transac_arr[i]=sc.nextInt();
		System.out.println("Enter total number of targets ");
		int targetNo = sc.nextInt();
		int targetarr[] = new int[targetNo];
		for(int i=0;i<targetNo;i++) {
			System.out.println("Enter target value");
			targetarr[i]=sc.nextInt();
			Transaction_Service_Implementation.search(targetarr[i], transac_arr);
		}
	    sc.close();
	}

}
