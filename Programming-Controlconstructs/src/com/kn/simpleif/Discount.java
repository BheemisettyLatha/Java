package com.kn.simpleif;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Amount in $ ");
		int num=scan.nextInt();
		boolean flag=discountamount(num);
		if(flag) {
			System.out.println("Discount applicable");
		}else {
			System.out.println("Discount not applicable");
		}

	}

	private static boolean discountamount(int num) {
		return num>100 ;
		
	}

}
