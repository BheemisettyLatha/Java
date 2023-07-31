package com.kn.elseifLadder;

import java.util.Scanner;

public class ZodiacSign {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Month (1-12):");
		int m=scan.nextInt();
		
		System.out.println("Enter date(1-31):");
		int d=scan.nextInt();
		String zodiacsign=checkZodiac(m,d);
		if( zodiacsign!=null) {
			System.out.println("Your Zyodicsign is:"+ zodiacsign);
		}else
		{
			System.out.println("Invalid date");
		}
	
	}

	private static String checkZodiac(int m, int d) {
		if((m==3 && d>=21) || (m==4 || d<=19)) {
			return "Aries";
		}else if((m==4 && d>=20) || (m==5 && d<=20)) {
			return "Taurus";
		}else if((m==5 && d>=20) || (m==6 && d<=20)) {
			return "Gemini";
		}else if((m==6 && d>=21) || (m==7 && d<=20)) {
		    return "Cancer";
		}
		else if((m==7 && d>=21) || (m==8 && d<=22)) {
			return "Leo";
		}else if((m==8 && d>=23) || (m==9 && d<=22)) {
			return "Virgo";
		}else if((m==9 && d>=23) || (m==10 && d<=22)) {
			return "Libra";
		}else if((m==10 && d>=23) || (m==11 && d<=21)) {
			return "Scorpio";
		}else if((m==11 && d>=22) || (m==12 && d<=21)) {
			return "Sagittarius";
		}else if((m==12 && d>=22) || (m==1 && d<=19)) {
			return "Capricon";
		}else if((m==1 && d>=20) || (m==2 && d<=18)) {
		     return "Aquarius";
		}else if((m==2 && d>=19) || (m==3 && d<=20)) {
			return "Pisces";
		}else
		{
			return "Null";
		}
		
	}

}
