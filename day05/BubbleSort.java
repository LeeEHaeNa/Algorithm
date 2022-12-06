package day05;
import java.util.*;
public class BubbleSort {
	//앞에서부터 버블정렬하기=> 1회 반복돌고 나면 가장 큰수가 오른쪽에 가있음 
	public static void bubble1(int []arr) {
		//중첩 for루프 이용해서 버블 정렬을 해봅시다. 
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
			System.out.println(i+": "+Arrays.toString(arr));
		}
	}//-----------------------
	//뒤에서 부터 버블정렬하기=> 1회 반복돌고 나면 가장 작은수가 왼쪽에 가있다. 
	public static void bubble2(int[] arr) {
		int cnt=0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = arr.length-1; j >i; j--) {
				if(arr[j-1]>arr[j]) {
					swap(arr,j-1,j);
				}
				cnt++;
			}//for-------
			System.out.println(i+": "+Arrays.toString(arr));
		}//for-----------
		System.out.println("cnt: "+cnt);
	}//--------------------------
	
	public static void swap(int[] arr, int m, int n) {
		int tmp=arr[m];
		arr[m]=arr[n];
		arr[n]=tmp;
	}//-----------------------
	//
	public static void bubble3(int[] arr) {
		int cnt=0;
		for (int i = 0; i < arr.length-1; i++) {
			int k=0;
			for (int j = arr.length-1; j >i ; j--) {
				if(arr[j-1]>arr[j]) {
					swap(arr,j-1,j);
					k++;//교환횟수 세기 
				}cnt++;
				if(k==0) break;
			}//for-----------
		}//for-------------------
		System.out.println("3. cnt: "+cnt);
	}//-------------------------------------
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("배열 크기 입력: ");
		int n=sc.nextInt();
		int []arr= new int[n];
		int []arr2= {1,3,6,4,7,8,9};
		Random ran=new Random();
		for(int i=0; i<arr.length-1; i++) {
			arr[i]=ran.nextInt(10)+1;
		}
		System.out.println(Arrays.toString(arr));
//		bubble1(arr);
//		System.out.println();
//		bubble2(arr);
		bubble2(arr2);
		System.out.println("--------");
		bubble3(arr2);
		System.out.println(Arrays.toString(arr));

	}

}
