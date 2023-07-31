package com.kn.ifelse;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scan.nextInt();
		boolean result=checkTheNumber(n);
		if(result) {
			System.out.println("The given number " +n+ " is POSIIVE");
		}else {
			System.out.println("The given number " +n+ " is NEGATIVE");
		}

	}
	static boolean checkTheNumber(int n) {
		if(n>0) {
		return true;
	}else {
		return false;
	}
	}
}
