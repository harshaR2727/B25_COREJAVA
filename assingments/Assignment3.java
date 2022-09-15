package com.tns.assingments;
import java.util.Scanner;
public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int water = sc.nextInt();
		if(water<=45)
		{
			System.out.println("water tax = NO TAX");
		}
		else if(water>45&&water<=75)
		{
			System.out.println("water tax = 475");
		}
		else if(water>75&&water<=125)
		{
			System.out.println("water tax = 750");
		}
		else if(water>125&&water<=200)
		{
			System.out.println("water tax = 1225");
		}
		else if(water>200&&water<=350)
		{
			System.out.println("water tax = 1650");
		}
		else {
			System.out.println("water tax = 2000");
			
		}
	}
}
