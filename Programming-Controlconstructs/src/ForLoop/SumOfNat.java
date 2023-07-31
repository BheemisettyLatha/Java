package ForLoop;

import java.util.Scanner;

public class SumOfNat {

	public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter number to perform sum of natural numbers");
				int n=scan.nextInt();
				sumOfNatural(n);
			}

	private static void sumOfNatural(int n) {
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}System.out.println(sum);

		
	}
	}


