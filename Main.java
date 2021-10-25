package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
	int num = sc.nextInt();
	int reversedNum = 0;

	for(; num!=0; num/=10){
	   int digit = num%10;
	   reversedNum = reversedNum*10+digit;
    }
		System.out.println("reverse of the number is "+reversedNum );
    }
}
