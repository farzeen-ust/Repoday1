package com.ust;

import java.util.Scanner;

public class MaxOfNums {
	   public static void main(String[] args) {
		
	   int a,b;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the numbers");
	   a=sc.nextInt();
	   b=sc.nextInt();
	   int max=a>b?a:b;
	   System.out.println(max);
	   System.out.println("Enter c value");
	   int c=sc.nextInt();
	   max=(a>b && a>c)?a:(b>c?b:c);
	   System.out.println(max);
	   sc.close();
	}
}