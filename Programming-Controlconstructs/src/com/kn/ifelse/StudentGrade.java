package com.kn.ifelse;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student Grade:");
		int n=scan.nextInt();
		boolean result=gradeMarks(n);
		if(result) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

	 static boolean gradeMarks(int n) {
		return n>50;
		
}
}
