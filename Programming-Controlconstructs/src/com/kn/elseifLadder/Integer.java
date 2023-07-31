package com.kn.elseifLadder;

import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any Integer:");
		int n=scan.nextInt();
		anyInteger(n);

	}

	private static void anyInteger(int n) {
		if(n>0)
		{
			System.out.println("POSITIVE NUMBER");
		}
		else if(n<0)
		{
			System.out.println("NEGATIVE NUMBER");
		}else
		{
			System.out.println("ZERO");
		}

	}

}
