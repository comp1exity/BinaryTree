// Nicolas Wise Binary Node
// 10 April 2023
// WSXNIC001

import java.util.ArrayList;
public class Account implements Comparable<Account>{
	//declaring instance variables
	private String name;
	private String description;
	
	//creating an array list of posts. Used for each user
	public ArrayList<String> postList = new ArrayList<String>();
	
	//object of a user
	public Account(String n, String d){
		this.name = n;
		this.description = d;
		this.postList = new ArrayList<String>();
	}	
	
	public int compareTo(Account other){
		return name.compareTo(other.name);
	}
	//add post
	public void addPost(String posts){
		this.postList.add(posts);
	}
	public void displayPost(){
		for (int i = this.postList.size() -1; i>=0; i--){
			System.out.println(this.postList.get(i));
		}
	}
	
	//returning name of this user
	public String getName(){
		return name;
	}
	//returning description of this user
	public String getDescription(){
		return description;
	}
}
