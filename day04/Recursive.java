package day04;

public class Recursive {

	public static void recursive(int num) {
		if(num<=0) {
			return;
		}
		
//		System.out.println(num); 4 3 2 1
		recursive(num-1);//재귀호출 - 재귀단계 
		System.out.println(num);
	}
	public static void main(String[] args) {
		recursive(4);
	}

}
