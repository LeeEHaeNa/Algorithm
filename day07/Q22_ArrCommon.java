package day07;

import static java.lang.System.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Q22_ArrCommon {

	public Set<Integer> getCommonItem(int[] a, int[] b) {
		Set<Integer> set = new HashSet<>();
			for(int i=0; i<b.length; i++) {
				for(int elem : a) {
				if(elem==b[i]) set.add(elem);
				}
			}return set;
	}
	
	public int[] getCommonItem2(int[] a, int[] b) {
		int p1=0;
		int p2=0;
		Arrays.sort(a);
		Arrays.sort(b);
		List<Integer> arrList=new ArrayList<>();
		while(p1<a.length && p2<b.length) {
			if(a[p1]==b[p2]) {
				arrList.add(a[p1]);
				p1++;
				p2++;
			}else if(a[p1]<b[p2]) {
				p1++;
			}else {
				p2++;
			}
		}//while-----
		int c[]=new int[arrList.size()];
		for(int i=0;i<arrList.size();i++)
			c[i]=arrList.get(i);
			return c;
		
		
	
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(in);
		System.out.println("배열 1의 크기: ");
		int n=sc.nextInt();
		
		System.out.println("배열 2의 크기: ");
		int m=sc.nextInt();
		
		int[] a=new int[n];
		int[] b=new int[m];
		
		System.out.println("배열 1에 저장할 값 입력: ");
		//a만큼 반복돌면서 입력받기
		for(int i=0; i<a.length; i++)
			a[i]=sc.nextInt();
		
		System.out.println("배열 2에 저장할 값 입력: ");
		//b만큼 반복돌면서 입력받기
		for(int i=0; i<b.length; i++)
			b[i]=sc.nextInt();
		
		Q22_ArrCommon app=new Q22_ArrCommon();
		Set<Integer>c =app.getCommonItem(a, b);
		
		System.out.println(c);
	}

}
