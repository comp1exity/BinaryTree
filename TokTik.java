// Nicolas Wise Binary Node
// 10 April 2023
// WSXNIC001

import java.util.*;
import java.io.*; 
import java.lang.*;
public class TokTik{
   private static Node root;
   static Scanner scan = new Scanner(System.in);
   static BinarySearchTree bt = new BinarySearchTree();
   
   public static void main(String [] args)  throws java.io.FileNotFoundException{
   	
   	
       loadData();
       
      }
      
      private static void loadData(){
      	String file = "dataset.txt";
      	try (BufferedReader nic = new BufferedReader(new FileReader(file))){
      		String line;
      		while ((line = nic.readLine())!=null){
      			//each line to an array of strings
      			String [] strings = line.split(" ");
      			
      			//switch statement. Create - add user/Add - add post
      			switch(strings[0]){
      				case "Create":
      					line = line.substring(line.indexOf(" ")+1, line.length());
      					String description =line.substring(line.indexOf(" ") + 1, line.length());
      					String name = strings[1];
      					//create object of account
      				     	BinarySearchTree bt = new BinarySearchTree();
      					Account account = new Account(name, description);
      					bt.insert(account);
      				
      				case "Add":
      					String accountName = strings[1];
      					String videoFile = strings[2];
      					String likes = strings[3];
      					String postDescription = String.join(" ", Arrays.copyOfRange(strings, 4, strings.length));
      					Post posts = new Post(accountName, postDescription, videoFile, likes);
      					//insert post function
      			}
      		}
      	}
      	catch (IOException e){
      		System.err.println("Error: "+e.getMessage());
      	}
      }
      
      private static void findDescription(){
      	System.out.println("Enter the account name: ");
      	String username = scan.nextLine();
      	//finish find method
      	Account account = bt.findAccount(username);
      	if (account!=null){
      		System.out.println("The profile description is: " + account.getDescription());
      	}
      	else{
      		System.out.println("Account not found");
      	}
      }
      
      private static void createAccount(){
      	System.out.println("Enter the account name: ");
      	String username = scan.nextLine();
      	
      	Account account = bt.findAccount(username);
      	if (account != null){
      		System.out.println("Account already exists.");
      	}
      	
      	System.out.println("Enter profile description: ");
      	String description = scan.nextLine();
      	
      	Account newAccount = new Account(username, description);
      	bt.insert(newAccount);
      	System.out.println("Account created");
      }
      
      private static void deleteAccount(){
      	System.out.println("Enter the account's name: ");
      	String username = scan.nextLine();
      	
      	Account account = bt.findAccount(username);
      	if (account == null){
      		System.out.println("Account not found");
      		return;
      	}
      	bt.delete(username);
      	System.out.println("Account deleted");
      } 
      
      private static void displayAllPosts(){
      	System.out.println("Enter the account name: ");
      	String accountName = scan.nextLine();
      	
      	Account account = bt.findAccount(accountName);
      	if (account == null){
      		System.out.println("Account not found");
      		return;
      	}
      	System.out.println("Posts: ");
      	account.displayPost();
      }
      
      private static void addNewPost(){
      	System.out.println("Enter the account name: ");
      	String accountName = scan.nextLine();
      	Account account = bt.findAccount(accountName);
      	if(account == null){
      		System.out.println("Account not found");
      		return;
      	}
      	System.out.println("Enter post: ");
      	String post = scan.nextLine();
      	
      	account.addPost(post);
      	System.out.println("Post entered");
      }
}


