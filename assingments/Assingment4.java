package com.tns.assingments;
import java.util.Scanner;
public class Assingment4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int fine;
		if(days<=5)
		{
			fine=days*1;
		}
		else if(days<=10)
		{
			fine=(5*1)+(days-5)*5;
		}
		else
		{
			fine=(5*1)+(5*5)+(days-10)*10;
		}
		System.out.println("Fine:"+fine);
	}
}
