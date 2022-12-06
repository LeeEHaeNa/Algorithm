package day04;

import java.util.Scanner;

public class Fibonacci {

	public static void fibo(int n) {//n은 항
		int num1=1;
		int num2=1;
		int num3=0;
		System.out.print(num1+" "+num2);

		for(int i=0; i<n-2; i++) {
			num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
		}
	}
	public static int fibo2(int n) {//n은 항
		if(n==1)return 1;
		if(n==2)return 1;
	return fibo2(n-2)+fibo2(n-1);
	
	}
	static int[]arr;
	public static int fibo3(int n) {
		if(n==1) return arr[n]=1;
		else if(n==2) return arr[n]=1;
		else return arr[n]=fibo3(n-2)+fibo3(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 입력:  ");
		int n=sc.nextInt();
//		fibo(n);
		for(int i=1; i<=n; i++) {
			System.out.print(fibo2(i));
		}
		System.out.println("\n-------------");
		arr=new int[n+1];
		fibo3(n);
		
		for(int a:arr) {
			if(a==0) continue;
			System.out.println(a+",");
		}
	}

}
