package ForLoop;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to construct the table:");
		int n=scan.nextInt();
        constructTable(n);
	}

	private static void constructTable(int n) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}

		
	}

}
