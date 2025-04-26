package com.ust;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Enter +,-,*,/,%");
	char op= sc.next().charAt(0);//to read char
	if(op=='+') 
	     System.out.println("Sum : "+(a+b));
	else if(op=='-')
		System.out.println("Difference : "+(a-b));
	
	else if (op=='*')
		System.out.println("Product :"+(a*b));
	else if(op=='/')
		System.out.println("Quotient :"+((float)a/b));
	else if (op=='%')
		System.out.println("Modulo :"+(a%b));
	else
		System.out.println("Invalid Operation");
	
		
	
}
}
