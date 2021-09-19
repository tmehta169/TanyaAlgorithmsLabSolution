package com.greatlearning.main;

import java.util.Scanner;

public class Denomination
{
	private static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("How Many denominations:");
		int size=sc.nextInt();
		
		int [] denominations=new int[size];
		
		System.out.println("enter the value");
		for(int i=0;i<size;i++)
		{
			denominations[i]=sc.nextInt();
		}
		
		MergeSortImplementation ms= new MergeSortImplementation();
		ms.sort(denominations, 0, denominations.length-1);
		
		for(int i=0;i<size;i++) 
		{
			System.out.println(denominations[i]);
		}
		System.out.println("Enter amount to be paid");
		int amt=sc.nextInt();
		
		for (int i=0;i<denominations.length;i++)
		{
			int n = (amt/denominations[i]);
			System.out.println(denominations[i] + ":" +n);
			
			amt=amt-(n*denominations[i]);
			
			if(i== denominations.length-1 && amt!=0) 
			{
				System.out.println("Not possible to pay");
			}
		}
	}
}
