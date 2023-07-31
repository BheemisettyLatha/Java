package com.kn.elseifLadder;

import java.util.Scanner;

public class CategorizeAge {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Age:");
		int n=scan.nextInt();
		age(n);
		
	}

	private static void age(int n) {
		if(n>=0 && n<=12) {
			System.out.println("Child");
		}else if(n<=19 && n>=13) {
			System.out.println("Teen age");
		}else if(n>=20 && n<=59) {
			System.out.println("Adult");
		}else {
			System.out.println("Senior citizen");
		}
		
	}

}
