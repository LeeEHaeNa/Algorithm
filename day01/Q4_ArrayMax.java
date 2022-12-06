package day01;
import java.util.*;
public class Q4_ArrayMax {

	public static int[] max_min(int[] arr) {
		int m[]=new int[2];//최대키,최소키 
		
		return m; 
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("인원수를 입력하세요 [키의 최대,최소 구합니다]: ");
		int num=sc.nextInt();
		int height[]=new int[num];
		//반복문 돌면서 height에 랜덤한 키를 저장하기 (100~190)
		for (int i = 0; i < num; i++) {
			height[i]=(int)(Math.random()*91+100);
		}
		int max = height[0]; 
		int min = height[0];
		for(int i=0;i<num;i++) {
		    if(max<height[i]) {
			max = height[i];
		    }
					
		    if(min>height[i]) {
			min = height[i];
		    }
		System.out.println("전체키: "+height[i]);
		}
		
		int m[]=max_min(height);
		m[0]=max;
		m[1]=min;
		System.out.printf("제일 큰 키: "+m[0]);
		System.out.printf("제일 작은 키: "+m[1]);
		
	}

}
