package com.ust;

public class OddOrEven {
public static void main(String[] args) {
	int  num=14;

	String oe=(num%2)!=0?"ODD":"EVEN";
	System.out.println("Number is "+oe);
    System.err.println("Number  not found");
}
}
