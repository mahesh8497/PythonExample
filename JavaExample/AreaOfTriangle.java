package day2;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base of the triangle");
		int base =sc.nextInt();
		System.out.println("Enter the height of triangle");
		int height=sc.nextInt();
		int area= (int) (0.5*base*height);
		System.out.println("Area of the Triangle is: "+area);
	}

}
