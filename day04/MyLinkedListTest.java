package day04;

public class MyLinkedListTest<T> {
	
	public static void main(String[] args) {
		MyLinkedList<String> list=new MyLinkedList<>();
		list.addLast("A");
		list.addLast("B");
		list.printCurrentNode();
		list.print();
		list.addLast("C");
		list.printCurrentNode();
		list.print();
		
		list.addFirst("D");
		list.printCurrentNode();
		list.print();
		list.removeFirst();
		list.printCurrentNode();
		list.print();
		list.removeLast();
		list.print();
		
		MyLinkedList.Node<String> delNode=new MyLinkedList.Node<>("B",null);
		
		list.remove(delNode);
		list.print();
		
		list.printCurrentNode();
		list.removeCurrentNode();
		list.print();
		
		list.clear();
		list.printCurrentNode();
		list.print();
	}
}