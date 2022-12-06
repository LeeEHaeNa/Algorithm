package day03;

public class MyStackTest {

	public static void main(String[] args) {
		MyStack<String> sk1=new MyStack<>();
		sk1.push("Java");
		sk1.push("JDBC");
		sk1.push("Oracle");
		sk1.push("MongoDB");
		
		System.out.println(sk1.peek());
		String item=sk1.pop();
		System.out.println("삭제된 데이터: "+item);
		System.out.println(sk1.peek());
		sk1.pop();
		sk1.pop();
		System.out.println(sk1.peek());
		sk1.pop();
		System.out.println(sk1.isEmpty());
//		sk1.pop();
		MyStack<Integer> sk2=new MyStack<>();
		sk2.push(10);
		sk2.push(20);
		System.out.println(sk2.peek());
	}

}
