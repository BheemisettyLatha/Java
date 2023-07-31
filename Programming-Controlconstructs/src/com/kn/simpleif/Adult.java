package com.kn.simpleif;

import java.util.Scanner;

public class Adult {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age:");
		int a=scan.nextInt();
		boolean result=adultAge(a);
		if(result) {
			System.out.println("Adult");
		}else {
			System.out.println("Not an Adult");
		}

	}

	private static boolean adultAge(int a) {
		if(a>21) {
			return true;
		}else {
		return false;
	}
	}
}
