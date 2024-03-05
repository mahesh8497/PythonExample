package day2;

import java.util.Scanner;

public class swap2Number {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first Number");
	int number1=sc.nextInt();
	System.out.println("Enter second Number");
	int number2=sc.nextInt();
	//int temp=0;
	int temp=number1;
    number1=number2;
	number2=temp;
	System.out.println("After Swapping Number");
	System.out.println(" value of number1 : " +number1);
	System.out.println(" value of number2 : " +number2);
	
	
	

	}

}
