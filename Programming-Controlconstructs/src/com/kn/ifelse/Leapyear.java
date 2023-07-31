package com.kn.ifelse;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
	    System.out.println("Enter the Year");
	    int n=scan.nextInt();
	    boolean result=leapYear(n);
	    if(result) {
	    	System.out.println("The given year " +n+ " is a Leap Year");
	    }else
	    {
	    	System.out.println("The given Year " +n+ " is not a Leap Year");
	    }
	    }


	private static boolean leapYear(int n) {
		return n%4==0;
		}
	
}