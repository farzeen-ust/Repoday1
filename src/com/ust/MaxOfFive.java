
package com.ust;
import java.util.Scanner;
public class MaxOfFive {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter five numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	int e=sc.nextInt();
	sc.close();
	int max =((a>b&&a>c&&a>d&&a>e)?a:(b>c&&b>d&&b>e)?b:(c>a&&c>d&&c>e)?c:(d>a&&d>b&&d>e)?d:e);
	System.out.println("max of five numbers "+max);
}
}


