package day3;

import java.util.Scanner;

public class Celsius_to_Fahrenheit {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius : ");
        float Celsius = sc.nextFloat();
        float Fahrenheit = Celsius * (9.0f/5.0f) + 32;
        
        System.out.println("The temperature is "+Fahrenheit+" degree Fahrenheit.");

	}

}
