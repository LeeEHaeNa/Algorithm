package day02;

import java.util.Scanner;

public class Q8_CharSearch {

	public int search(String str, char ch) {
		int cnt=0;
		
		return cnt;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열을 입력하세요 ");
		String str=sc.nextLine();
		str.toCharArray();
		System.out.println("검색할 문자 하나를 입력하세요 ");
		String word=sc.next();
		String blank="";
		for(int i=0; i<str.length(); i++) {
			char target=str.charAt(i);
			String str1=Character.toString(search);
			if(str1==ch)
				blank+=ch;
		}
		System.out.println(blank.length());
	}

}
