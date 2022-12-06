package day01;
/*중첩 반복문 돌면서 곱셈 테이블 출력 */
public class Q3_GopTable {

	public static void printTable() {
		System.out.print("  ");
		for (int x = 1; x <=9; x++) {
			System.out.println();
		if(x==1) {
			System.out.println("| 1 2 3 4 5 6 7 8 9");
			System.out.println("-----------------");
		}
		
		for (int y = 1; y <= 9; y++) {
			System.out.print(y);
			if(y==1) {
				System.out.println(x+"|");
			}
			System.out.print(x*y);
		}
		}
	}
	
	public static void main(String[] args) {
		printTable();
	}

}
