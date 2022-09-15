package com.tns.assingments;
import java.util.Scanner;
public class Assigment2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if(n%3==0) {
		System.out.println("it is a multiple of 3");
	}
	else {
		System.out.println("it is not a multiple of 3");
	}
  }
}