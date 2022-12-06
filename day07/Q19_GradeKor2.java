package day07;
import java.util.*;

public class Q19_GradeKor2 {
	public void getKorGrade(int n, int []kor) {
		Scanner sc=new Scanner(System.in);
		int[] kor2=Arrays.copyOf(kor, n);
		for (int i=0; i<n; i++) {
			kor[i]=sc.nextInt();
		}Arrays.sort(kor);
		for(int i=1; i<=n; i++) {
		System.out.print(i+"등");
		}
		System.out.println(Arrays.toString(kor));
	}

	public static void main(String[] args) {
		//학생수 입력받기 
		//학생수 만큼 국어 성적 입력받기 
		Q19_GradeKor2 Q=new Q19_GradeKor2();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] kor=new int[n];
		
		Q.getKorGrade(n,kor);
	
		//getKorGrade()호출하면 ==> 등수를 배열에 담아 반환 
	}

}
