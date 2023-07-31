package com.kn.simpleif;

import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a charector");
		char c=scan.next().charAt(0);
		boolean result=displayCapital(c);
		if(result) {
			System.out.println("Capital Letter");
		}else {
			System.out.println("Not a capital letter");
		}
			
	}

 static boolean displayCapital(char c) {
		return c>='A' && c<='Z';
	}
}
