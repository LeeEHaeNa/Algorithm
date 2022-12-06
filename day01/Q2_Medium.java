package day01;

import java.util.Scanner;

public class Q2_Medium {

	public static int median(int a, int b, int c) {
		int res=0;
		int mid1=0;
		int midian=0;
		int firstmax=(a>b)? a : b ;
		if(firstmax==a) {
			mid1 =(b>c)?b:c;
				if(mid1==b) {
					midian=b;
				}else if(mid1==c) {//c>b, a>b
					if(a>c) {
						midian=c;
					}else midian=a;//c>a
				}
					
		}else if(firstmax==b) { //b>a
			mid1=(a>c)?a:c;
				if(mid1==a) { //a>c
					midian=a;
				}else if(mid1==c) { //c>a , b>a
					if(b>c) { //b>c>a
						midian=c;
					}else midian=b;  //c>b>a
				};
		}	
		return midian;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요. ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int res=median(a,b,c);
		
		System.out.printf("%d, %d, %d 중에 중앙값: %d%n",a,b,c, res);
		
		
	}

}
