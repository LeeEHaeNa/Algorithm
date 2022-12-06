package day07;

import java.util.Scanner;

public class Q23_SlidingWindow {
	static int[] fibo;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("며칠의 매출기록을 입력하실래요?");
		int n=sc.nextInt();
		System.out.println("연속 며칠의 매출을 구할까요?");
		int k=sc.nextInt();
		System.out.printf("%d일간의 매출기록을 입력하세요%n",n);
		int []a=new int[n];
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		int max=getMaxOut(n,k,a);
		System.out.printf("연속 %d일간의 최대 매출액: %d%n",n,max);
		}
		fibo=new int[n+1];
		getMaxOut(n, k, a);
		for(int i=1; i<=n; i++) System.out.print(fibo[n]+" ");

	}

	private static int getMaxOut(int n, int k, int[] a) {
		if(fibo[n]>0) return fibo[n];
		else return fibo[n]=getMaxOut(n-2,k,a)+getMaxOut(n-1,k,a);
	}

}
