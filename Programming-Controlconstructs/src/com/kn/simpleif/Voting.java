package com.kn.simpleif;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age:");
		int n=scan.nextInt();
		boolean result=voteEligibility(n);
		if(result) {
			System.out.println("Eligible for voting");
		}else {
			System.out.println("Not eligible for voting");
		}

	}

	private static boolean voteEligibility(int n) {
		return n>=18;
	}

}
