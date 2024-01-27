package com.codingeekho;

public class Prictice implements Babu {
	
	int r;
	int e;
	
	public Prictice(int r,int e) {
		this.r=r;
		this.e=e;
	}

	public void babu() {
		System.out.println("this is prectice babu");
	}

	public static void main(String args[]) {
		//Prictice b1=new Prictice();
		Prictice b = new Prictice(4,5);
		System.out.println(b.e);
		b.babu();
		

	}

}
