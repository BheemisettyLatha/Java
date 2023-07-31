package ForLoop;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		fibonacciSeries(n);
		
	}

	private static void fibonacciSeries(int n) {
		int firstnum=0,secondnum=1,nextnum=0;
		System.out.print(firstnum +" "+ secondnum +" ");
		for(int i=3;i<=n;i++)
		{
			nextnum=firstnum+secondnum;
			System.out.print(nextnum +" ");
			firstnum=secondnum;
			secondnum=nextnum;
		}
		
		
	}
	
}