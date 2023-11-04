package Java;

public class Logics {
	public static int findFactorial(int in) {
			int fact=1;
		for(int i=1;i<=in;i++) {
			fact=i*fact;
		}
	return fact;
	}
	
	public static void gcd(int a, int b) {
		int great=0;
		for(int i=1;i<=a;i++) { //12, 24
			if(a%i==0 && b%i==0) {
				great=i;
			}
			
		}
		System.out.println(great);
		
	}
	public static void calculateSum(int in) {
		int sum=0;
		for(int i=1;i<=in;i++) {
			sum=sum+i;
			
		}
		System.out.println(sum);
	}
	static void printEvenNumbers(int in) {
		int sum=0;
		for(int i=1;i<=in;i++) {
			if(i%2==0) {
				System.out.println(i+" ");
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	static void printOddNumbers(int in) {
		int sum=0;
		for(int i=1;i<=in;i++) {
			if(i%2!=0) {
				System.out.println(i+" ");
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	static boolean CheckPalindrome(int in) {//455
		int org=in;
		int rev=0;
		while(in!=0) {
			rev=rev*10+in%10;
			in=in/10;
		}
		
		if(org==rev) {
			return true;
		}
		else {
			return false;
		}
		
	}
	static void raiseToN(int a, int b) {
		int sum=1;
		for(int i=1;i<=b;i++) {
			sum=sum*a;
		}
		System.out.println(sum);
	}
	static void squareOfNum(int in) {
		int sum=1;
		for(int i=1;i<=2;i++) {
			sum=sum*in;
		}
		System.out.println(sum);
	}
	static void cubeOfNum(int in) {
		int sum=1;
		for(int i=1;i<=3;i++) {
			sum=sum*in;
		}
		System.out.println(sum);
	}
	static void multiplicationTable(int in) {
		for(int i=1;i<=10;i++) {
			System.out.println(in+"x"+i+"="+in*i);
		}
	}
	static boolean armstrongNum(int in) {
		int temp=in;
		int r;
		int sum=0;
		while(in>0) {
		r=in%10;
		in=in/10;
		sum=sum+r*r*r;
		}
		if(temp==sum) {
			return true;
		}
		else {
			return false;
		}
	}
	static void fibonacciSeries(int in) {
		int num1=0;
		int num2=1;
		if(in==1) {
			System.out.print(num1);
		}
		else if(in==2) {
			System.out.print(num1+num2);
		}
		else if(in>=3){
			System.out.print(num1+" ");
			System.out.print(num2+" ");
		for(int i=3;i<=in;i++) {						
			int sum=num1+num2;
			System.out.print(sum+" ");
			num1=num2;
			num2=sum;
		}
		}
	}
	public static boolean primeNumber(int in) {
		boolean k=true;
		for(int i=2;i<in;i++) {
			if(in%i==0) {
				k=false;
			}
		}
		if(k) {
			return true;
		}
		else {
			return false;
		}
	}
}
