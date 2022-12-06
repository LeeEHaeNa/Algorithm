package day06;

import java.util.Comparator;

/*이진 검색 트리는 이진 트리가 다음 조건을 만족하면 된다.
 * 1. 어떤 노드 N을 기준으로 왼쪽 서브 트리 노드의 모든 키 값은 
 * 노드 N의 키값 보다 작아야 한다.
 * 2. 오른쪽 서브트리 노드의 키 값은 노드 N의 키 값 보다 커야 한다
 * 3. 같은 키 값을 갖는 노드는 없다.
 * */
public class BinaryTree<K,V> {

	private Node<K,V> root;
	//키값의 대소관계 비교를 위한 멤버변수
	private Comparator<? super K> comparator;
	
	static class Node<K,V>{
		 K key;
		 V data;
		 
		 Node<K,V> left;
		 Node<K,V> right;
		 public Node(K key,V data, Node<K,V> left, Node<K,V> right) {
			 this.key=key;
			 this.data=data;
			 this.left=left;
			 this.right=right;
		 }//-----------
		 public void print() {
			 System.out.println(data);
		 }
		
	}//////////
	
	public BinaryTree() {
		root=null;
	}
	public BinaryTree(Comparator<? super K> comparator) {
		this.comparator=comparator;
	}
	//키값을 비교하는 메서드 
	private int comp(K key1, K key2) {
		if(this.comparator!=null) {
			return comparator.compare(key1, key2);
		}else {
			return ((Comparable<K>)key1).compareTo(key2);
		}
	}//--------------
	
	//노드를 삽입하는 메서드 
	public void add(K key, V data) {
		if(root==null) {
			root=new Node<K,V>(key, data,null,null);
		}else {
			addNode(root, key, data);
		}
	}//-------------------------------
	public void addNode(Node<K, V> node, K key, V data) {
		int condition=comp(key, node.key);
		if(condition==0) {return; //key가 이진트리에 이미 존재하는 경우 
		}else if(condition<0) {//
			if(node.left==null) {
				node.left=new Node<K,V>(key, data, null, null);
			}else {//null이 아니라면 다시 추가 
				addNode(node.left, key, data);
			}
		}else {
			if(node.right==null) {
				node.right=new Node<K,V>(key, data, null, null);
			}else {
				addNode(node.right, key, data);
				
			}
		}
	}//------------------
	
	//키값으로 이진검색트리에서 검색을 수행하는 메서드 
	public V search(K key) {
		Node<K,V> ptr=root;
		while(true) {
			if(ptr==null) return null;//검색하지 못한 경우  
			int condition=comp(key,ptr.key);
			if(condition==0) { //검색 성공 
				return ptr.data;
			}else if(condition<0) {
				ptr=ptr.left;//왼쪽 서브트리로 계속 탐색 
			}else ptr=ptr.right;//오른쪽에서 계속 검색 
		}//while--
	}//-----------------
	//key값에 해당하는 노드를 삭제 
	public boolean remove(K key) {
		Node<K,V> p=root;//스캔중인 노드 
		
		Node<K,V> parent=null;//스캔중인 노드의 부모노드 
		boolean isLeftChild=true;
		//삭제할 노드 검색 
		while(true) {
			if(p==null) return false;
			int cond=comp(key,p.key);
			if(cond==0) break;//삭제할 노드 찾아서 반복문 이탈 
			else {
				parent=p;
				if(cond<0) {
					isLeftChild=true; //왼쪽 
					p=p.left;
				}else {
					isLeftChild=false; //오른쪽 
					p=p.right;
				}
				
			}
		}//while---------
		//삭제할 노드를 찾았다면 
		if(p.left==null) {
			if(p==root) {//삭제할노드가 뿌리 
				root=p.right;//오른쪽 노드가 뿌리노드가 되거나 null을 할당한다. 
			}else if(isLeftChild) {
				parent.left=p.right;
			}else {
				parent.right=p.right;
			}
		}else if(p.right==null) {
			if(p==root) {
				root=p.left;
			}else if(isLeftChild) {
				parent.left=p.left;
			}else {
				parent.right=p.left;
			}
		}else {
			parent=p;//5
			Node<K,V> left=p.left;
			isLeftChild=true;
			while(left.right!=null) {
				parent=left;//2
				left=left.right;//4
				isLeftChild=false;
			}//while-----
			//왼쪽 방향 서브트리에서 찾은 큰 값을 삭제하려했던 노드에 복사 
			p.key=left.key;//4를 5의 위치로 이동 
			p.data=left.data;
			if(isLeftChild) {
				parent.left=left.left;
			}else {
				parent.right=left.left;//3을 2의 오른쪽에 붙임. left(4);
			}
			
		}
		return true;
		
		
	}//---------------------------------
	
	//전체 노드를 키값의 오름차순으로 출력 
	public void print() {
		printSubTree(root);
	}//-----------
	public void printSubTree(Node<K, V> node) {
		if(node!=null) {
			printSubTree(node.left);
			System.out.println(node.key+": "+node.data);
			printSubTree(node.right);
		}
		
	}
	
	
}//////////////
