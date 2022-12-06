package day02;
import java.util.*;
public class Q10_LongWord {
	public String search(String str) {
		String res="";
		int min=Integer.MIN_VALUE;
		String[] arr=str.split(" ");
		for(String s:arr) {
			int len=s.length();
			if(len>min) {
				min=len;
				res=s;
			}
		}
		
		
		return res;
	}
	

	public static void main(String[] args) {
		Q10_LongWord q=new Q10_LongWord();
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열을 입력하세요: ");
		String str=sc.nextLine();
		System.out.println(q.search(str));
		
	}

}
