package day3;

import java.util.Scanner;

public class kilometer_mile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the kilometer: ");
		float kilometer=sc.nextFloat();
		float miles=(float) (kilometer*0.621371);

		System.out.println("After the conversion of kilometer to miles is :" +miles);
	}

}
