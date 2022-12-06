package day02;

import java.util.Scanner;

public class Q6_CardConv {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char arr[]=new char[32];//int=> 32bit
		System.out.println("음수가 아닌 정수(양수) 입력: ");
		int n=sc.nextInt();
		
		
		System.out.println("몇진수로 변환할까요? (2~36): ");
		int radix=sc.nextInt();
		printRadix(n,radix,arr);
	}
	public static void printRadix(int num, int r, char[] arr) {
		System.out.printf("%d를 %d진수로 변환: ",num,r);
		
		int i=conversion(num, r, arr);
		
		//arr에 저장된 값을 역으로 출력 
		
	}
	private static int conversion(int num, int radix, char[] arr) {
		//기수 변환 (2진수 변환) radix=2(2진수)
		//num=45
		int cnt=0;
		do {
			arr[cnt++]=(char) (num%radix);
			num=num/radix;
		}while(num!=0);
		
		return cnt;
		
	}
}
