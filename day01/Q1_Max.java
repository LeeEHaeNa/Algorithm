package day01;
import java.util.*;

public class Q1_Max{
	public static int max2(int a, int b) {
		int max =(a>b)? a: b ;
		return max;
	}
	
	public static int max3(int a, int b, int c) {
		
		int max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		
		return max;
		
	}
	
	
	public static int max4(int a, int b, int c, int d) {
		int max=0;
		int tmp=0,tmp1=0;
		tmp=(a>b)?a:b;
		tmp1=(tmp>c)?tmp:c;
		max=(tmp1>d)?tmp1:d;
		
		return max;
	}
	
	public static void main(String[] args) {
		int a=50;
		int b=32;
		int c=45;
		int d=79;
		
		int mx=max2(b,c);
		System.out.printf("%d와 %d중 최대값: %d%n",b,c,mx);
		
		mx=max3(a,b,c);
		System.out.printf("%d와 %d와 %d중 최대값: %d%n",a,b,c,mx);
	
		mx=max4(a,b,c,d);
		System.out.printf("%d와 %d와 %d와 %d중 최대값: %d%n",a,b,c,d,mx);
		
	
	
	}

}
