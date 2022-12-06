package day07;
import java.util.*;

public class Q19_GradeKor {
	public int[] getKorGrade(int n, int []kor) {
		int[] grade=new int[n];
		for(int i=0;i<n; i++) {
			grade[i]=1;
			for(int j=0; j<n; j++) {
				if(kor[i]<kor[j])grade[i]++;
			}
		}//for-----
		return grade;
		
		
	}

	public static void main(String[] args) {
		//학생수 입력받기 
		//학생수 만큼 국어 성적 입력받기 
		Q19_GradeKor Q=new Q19_GradeKor();
		Scanner sc=new Scanner(System.in);
		System.out.println("학생 수 입력: ");
		int n=sc.nextInt();
		int[] kor=new int[n];
		for (int i=0; i<n; i++) {
			kor[i]=sc.nextInt();
		}
	
	
		//getKorGrade()호출하면 ==> 등수를 배열에 담아 반환 
	}

}
