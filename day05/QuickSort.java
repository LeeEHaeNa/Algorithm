package day05;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int arr[]= {1,8,7,4,5,2,6,3,9};
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);//quickSort(arr,0,8)
		System.out.println("--퀵 정렬 이후-----------");
		System.out.println(Arrays.toString(arr));

	}//--------------------------------------
	//퀵 정렬의 분할과정을 출력하는 메서드 
	public static void printProcess(int []arr, int left, int right, int pivot) {
		System.out.println("pivot: "+pivot);
		System.out.printf("arr[%d] ~ arr[%d]: {", left, right);
		for(int i=left; i<right; i++) {
			System.out.printf("%d", arr[i]);
		}
		System.out.printf("%d}%n",arr[right]);
	}///////////////////
	static void quickSort(int[] arr, int left, int right) {//(0,8)
		int pl=left;
		int pr=right;
		int pivot=arr[(pl+pr)/2];
		
		printProcess(arr,left,right,pivot);
		
		do {
			while(arr[pl]<pivot)pl++;
			while(arr[pr]>pivot)pr--;
			if(pl<=pr) {
				swap(arr,pl++,pr--);
			}
		}while(pl<=pr);
		/////////////////////////////////
		if(left<pr) quickSort(arr,left,pr);
		if(pl<right) quickSort(arr,pl,right);
		//////////////////////////////////
	}//---------------------------
	static void swap(int[] arr, int i, int k) {
		int tmp=arr[i];
		arr[i]=arr[k];
		arr[k]=tmp;
	}//----------------------------------------
}
