package com.DS.services;

public class Note_Services {
	public static void min_note_counter(int currencyarr[],int target) {
		Sorter.arr=currencyarr;
		Sorter s = new Sorter();
		s.sort();
		if(currencyarr[0]>target) {
			System.out.println("Sorry amount is lower than highest denomination. Not possible to pay");
			return;
		}
		int denom [] = new int[currencyarr.length];
		for(int i=0;i<currencyarr.length;i++) {
			int q=target / currencyarr[i];
			target= target % currencyarr[i];
			denom[i]=q;
		 }
		
		if(target==0) {
			System.out.println("Your payment approach to give minimum number of notes will be ");
			for(int j=0;j<denom.length;j++) {
				if(denom[j]>0)
				System.out.println(currencyarr[j]+" : "+denom[j]);
				
		     }
		}else 
			System.out.println("Sorry not possible to pay using the highest denomination maximum times");
	}

}
