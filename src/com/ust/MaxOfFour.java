package com.ust;

import java.util.Scanner;

public class MaxOfFour {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter four numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	sc.close();
	int max =((a>b&&a>c&&a>d)?a:(b>c&&b>d)?b:(c>a&&c>d)?c:d);
	System.out.println("max of four numbers "+max);
}
}
