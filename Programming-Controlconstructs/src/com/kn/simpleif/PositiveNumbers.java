package com.kn.simpleif;

import java.util.Scanner;

public class PositiveNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		boolean flag=aPositiveNumber(num);
		if(flag)
		{
			System.out.println("The given number " + num + " is a POSITIVE number");
		}else
		{
			System.out.println("The given number " + num + " is NOT A POSITIVE number");
		}
	}

	private static boolean aPositiveNumber(int num) {
		if(num>0)
		{
			return true;
		}
		else 
		{
		return false;
		}
	}
}
