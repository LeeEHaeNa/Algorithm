package day02;

import java.util.Scanner;

public class Q17_LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("배열 크기 입력: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("검색할 값 입력:");
		int key=sc.nextInt();
		
		int idx=search(arr,n,key);
		//검색한 값이 없다면 -1을 반환하고, 있으면 해당 인덱스 번호를 반환한다 
		System.out.println((idx<0)?key+"값은 배열에 x":key+"값은 배열 인덱스 "+idx+"번지에 있어요");
	}//------------------

	
	private static int search(int[] arr, int n, int key) {
		int idx=-1;
		int i;
		for(i=0;i<n;i++) {
			if(arr[i]==key) {//판단1
				return i;
			}
		}
		if(i==n-1) {//판단2
			return -1;
		}
		return idx;
		
	}
	

}
