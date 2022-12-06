package day03;
import java.util.*;
public class Q2_ArraysBinarySearch {

	static Scanner kb=new Scanner(System.in);
	
	public static void floatBinarySearch() {
		float[] arr= {1.3f, 2.45f, 10, 'A','z',30e-1f, 7.1f};
		System.out.println("검색할 실수 값을 입력하세요: ");
		float key=kb.nextFloat();
		int idx=Arrays.binarySearch(arr, key);
		if(idx<0) {
			System.out.println(key+"값은 없습니다");
		}else {
			System.out.printf("검색하려는 %.2f값은 %d에 있습니다 arr[%d]=%.2f %n",key, idx, idx, arr[idx]);
		}
	}//-----------------------------
	/*String클래스가 Comparable인터페이스를 상속받아 구현하고 있기 때문에 정렬이된다.
	 * => 정렬이 되면 이진검색 가능하다. 
	 * */
	public static void stringBinarySearch() {
		String[] str= {
				"abstract",   "assert",       "boolean",   "break",      "byte",
	            "case",       "catch",        "char",      "class",      "const",
	            "continue",   "default",      "do",        "double",     "else",
	            "enum",       "extends",      "final",     "finally",    "float",
	            "for",        "goto",         "if",        "implements", "import",
	            "instanceof", "int",          "interface", "long",       "native",
	            "new",        "package",      "private",   "protected",  "public",
	            "return",     "short",        "static",    "strictfp",   "super",
	            "switch",     "synchronized", "this",      "throw",      "throws",
	            "transient",  "try",          "void",      "volatile",   "while"
		};
		System.out.println("검색할 키워드를 입력하세요: ");
		String keyword=kb.next();
		Arrays.sort(str);
		int idx=Arrays.binarySearch(str, keyword);
		if(idx<0) {
			System.out.println(keyword+"는 없습니다.");
		}else {
			System.out.println("해당 키워드는 str["+idx+"]에 있습니다");
		}
		
		
	}//-------------------------------
	
	public static void memberBinarySearch() {
		//MEMBER객체 4개 생성해서 배열에 저장
		Member m1=new Member("김길동", 32, 157);
		Member m2=new Member("이순신", 27, 178);
		Member m3=new Member("최영길", 20, 187);
		Member m4=new Member("강길남", 22, 167);
		
		Member[] members= {m1,m2,m3,m4};
		//나이를 기준으로 오름차순 정렬 
		System.out.println(Arrays.toString(members));
		System.out.println("--- 오름차순 정렬---------------");
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		//검색할 나이 입력받아서 해당 나이를 가진 회원이 있는지 여부를 출력하세요 
		System.out.println("검색할 회원의 나이는? ");
		int findAge=kb.nextInt();
		int idx=Arrays.binarySearch(members, new Member("",findAge,0));
		if(idx<0) {
			System.out.println(findAge+"세의 회원은 없습니다");
		}else {
			System.out.println(findAge+"세의 회원을 찾았습니다");
			System.out.println(members[idx]);
		}
	}
	
	public static void empBinarySearch() {
		//Emp객체를 4개 이상 생성해서 배열에 저장하세요 
		Emp e1=new Emp("김자바",180);
		Emp e2=new Emp("이자바",175);
		Emp e3=new Emp("날자바",190);
		Emp e4=new Emp("널자바",165);
		
		Emp[] emps= {e1,e2,e3,e4};
		System.out.println(Arrays.toString(emps));
		
		Arrays.sort(emps, Emp.HEIGHT_ORDER);;
		System.out.println("---키 오름차순 정렬후-------");
		System.out.println(Arrays.toString(emps));
		//정렬한 뒤 
		System.out.print("키가 몇cm인 사람을 찾고있나요?");
		int findHeight=kb.nextInt();
		int idx=Arrays.binarySearch(emps, new Emp("",findHeight), Emp.HEIGHT_ORDER);
		//Arrays binarySearch() 이용해서 검색후 검색한 사람의 모든 정보 출력하세요  
		if(idx<0) {
			System.out.println(findHeight+"키의 회원은 없습니다");
		}else {
			System.out.println(findHeight+"키의 회원을 찾았습니다");
			System.out.println(emps[idx]);
		}
	}
	
	public static void main(String[] args) {
//		floatBinarySearch();
		
//		memberBinarySearch();
		empBinarySearch();
	}

}
