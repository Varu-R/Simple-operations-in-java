package Java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		for(int j=0;j<=100;j++) {
		System.out.println("Enter 1 if you wnat to perform an operations");
		System.out.println("Enter 2 if you don't want to perform operatons");
		Scanner scan=new Scanner(System.in);
		
		int ret=scan.nextInt();
		
		if(ret==1) {
		Logics lo=new Logics();
		System.out.println("Press 1 to find Factorial");
		System.out.println("Press 2 to find Greatest common divisor between two numbers");
		System.out.println("Press 3 to calculate sum");
		System.out.println("Press 4 to print Even numbers and sum of it also");
		System.out.println("Press 5 to odd numbers and sum of it also");
		System.out.println("Press 6 to check Palindrome or not");
		System.out.println("Press 7 to print raise to n");
		System.out.println("Press 8 to print square of a number");
		System.out.println("Press 9 to print cube of a number");
		System.out.println("Press 10 to print multiplication table of a number");
		System.out.println("Press 11 to print Armstrong number");
		System.out.println("Press 12 to print Fibonacci series");
		System.out.println("Press 13 to check prime number");
		
		
		int operator=scan.nextInt();
		
		switch(operator) {
		case 1:
			System.out.println("Enter a number");
			int in=scan.nextInt();
			int res=lo.findFactorial(in);
			System.out.println(res);
			break;
		case 2:
			System.out.println("Enter 2 numbers ");
			int a=scan.nextInt();
			int b=scan.nextInt();
			lo.gcd(a, b);
			break;
		case 3:
			System.out.println("Enter a number");
			in=scan.nextInt();
			lo.calculateSum(in);
			break;
		case 4:
			System.out.println("Enter a number");
			 in=scan.nextInt();
			lo.printEvenNumbers(in);
			break;
		case 5:
			System.out.println("Enter a number");
			 in=scan.nextInt();
			lo.printOddNumbers(in);
			break;
		case 6:
			System.out.println("Enter a number");
			in=scan.nextInt();
			boolean ress=lo.CheckPalindrome(in);
			
			if (ress==true) {
				System.out.println("Yes! it is Palindrome");
			}
			else {
				System.out.println("No it's not");
			}
		
			break;
		case 7:
			System.out.println("Enter two numbers");
			 a=scan.nextInt();
			 b=scan.nextInt();
			lo.raiseToN(a, b);
			break;
		case 8:
			System.out.println("Enter a number");
			in=scan.nextInt();
			lo.squareOfNum(in);
			break;
		case 9:
			System.out.println("Enter a number");
			in=scan.nextInt();
			lo.cubeOfNum(in);
			break;
		case 10:
			System.out.println("Enter a number");
			in=scan.nextInt();
			lo.multiplicationTable(in);
			break;
		case 11:
			System.out.println("Enter a number");
			in=scan.nextInt();
			 boolean resk=lo.armstrongNum(in);
			 if(resk==true) {
				 System.out.println("Yes!! it is Armstrong number");
			 }
			 else {
				 System.out.println("No it's not");
			 }
			break;
		case 12:
			System.out.println("Enter a number");
			in=scan.nextInt();
			lo.fibonacciSeries(in);
			break;
		case 13:
			System.out.println("Enter a number");
			in=scan.nextInt();
			boolean res5=lo.primeNumber(in);
			if(res5 == true) {
				System.out.println("Yes!! it is prime number");
			}
			else {
				System.out.println("No it's not");
			}
			break;
			
		default:
			System.out.println("Enter proper value");
		}
		
		}	
		
		else if(ret==2){
			System.out.println("THANK YOU!!!!");
			break;
		}
		else {
			System.out.println("Enter correct value");
		}
			
		}
	}

}
