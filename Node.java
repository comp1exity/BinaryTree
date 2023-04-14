// Nicolas Wise Binary Node
// 10 April 2023
// WSXNIC001

import java.util.ArrayList;

public class Node<Account>{
	
	public Account data;
	public Node<Account> left;
	public Node<Account> right;
	
	
	public Node(Account d, Node<Account> l, Node<Account> r){
			this.data = d;
			l = left;
			r = right;
	}
	
	public Account getData(){
		return data;
	}
	
	public Node getLeft(){
		return left;
	}
	public Node getRight(){
		return right;
	}
}
