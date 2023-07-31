package com.kn.ifelse;

import java.util.Scanner;

public class CitizenDiscount {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=scan.nextInt();
		CitizenDiscountApp cd=new CitizenDiscountApp();
	    cd.discount(age);
	}

}

