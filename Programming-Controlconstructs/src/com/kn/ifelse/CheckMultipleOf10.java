package com.kn.ifelse;

import java.util.Scanner;

public class CheckMultipleOf10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr a number:");
		int n=scan.nextInt();
		boolean result=checkTheNumber(n);
		if(result) {
			System.out.println("The given number " +n+ " is Multiple of 10 ");
		}else {
			System.out.println("The given number " +n+ " is not Multiple of 10");
		}
		

	}

	private static boolean checkTheNumber(int n) {
		if(n%10==0) {
		return true;
	}else {
		return false;
	}
	}

}
