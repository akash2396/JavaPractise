package Practise;

import java.util.Scanner;
public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number= ");
		int a=sc.nextInt();
		int temp=a;
		int rev=0;
		int rem;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
		System.out.println(rev);

	}

}
