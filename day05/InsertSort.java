package day05;

import java.util.Arrays;

public class InsertSort {
//값의 비교를 통해 삽입할 위치를 찾는 방식 
	public static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int tmp=arr[i];
			int j=i-1;
			for(; j>=0; j--) {
				if(arr[j]>tmp) {
					arr[j+1]=arr[j];
				}else break;
			}
			arr[j+1]=tmp;
		}//for------
	}
	
	public static void insertSort2(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int tmp=arr[i];
			int j=i-1;
			for(; j>=0 && arr[j]>tmp; j--) {
					arr[j+1]=arr[j];
			}
			arr[j+1]=tmp;
		}//for------
	}//-------------------------------
	public static void main(String[] args) {
		int arr[]= {7,8,4,1,9,2};
		System.out.println(Arrays.toString(arr));
		insertSort2(arr);
		System.out.println("--삽입 정렬 후----------");
		System.out.println(Arrays.toString(arr));
	}

}
