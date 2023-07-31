package ForLoop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		int fact = fact(n);
		System.out.println("The Factorial of a Given Number is " +fact);
		scan.close();
	}

	private static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
		
	}
		

	}



	
