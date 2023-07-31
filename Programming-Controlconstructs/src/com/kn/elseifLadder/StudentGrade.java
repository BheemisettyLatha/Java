package com.kn.elseifLadder;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks");
		int n=scan.nextInt();
		gradeMarks(n);
		

	}

	private static void gradeMarks(int n) {
		if(n<=100 && n>=90) {
			System.out.println("A Grade");
		}else if(n<=89 && n>=80) {
			System.out.println("B Grade");
		}else if(n<=79 && n>=70) {
			System.out.println("C Grade");
		}else if(n<=69 && n>=60) {
			System.out.println("D Grade");
		}else {
			System.out.println("F Grade");
		}
		
	}

}
