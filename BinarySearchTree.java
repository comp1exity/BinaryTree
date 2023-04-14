// Nicolas Wise Binary Node
// 10 April 2023
// WSXNIC001

public class BinarySearchTree
{

   public Node root;
   
   public BinarySearchTree ()
   {
      root = null;
   }

   //insert
   public void insert(Account d){
   	root = insertNode(root, d);
   }
   //insert into Binary Search Tree.
   public Node<Account> insertNode(Node<Account> root, Account data){
   	if (root == null){
   		root = new Node<Account>(data,null,null);
   	}
   	int cmp = data.compareTo(root.data);
   	if (cmp < 0){
   		root.left = insertNode(root.left, data);
   	}
   	else if (cmp > 0){
   		root.right = insertNode(root.right, data);
   	}
   	return root;
   }
   
   //find function, provides functionality in seperate methods
   public Node findNode(String username){
   	Node thisNode = this.root;
   	while (thisNode != null){
   		if (username.equals(thisNode.data.getName())){
   			return thisNode;
   		}
   		else if (username.equals(thisNode.data.getName())<0){
   			thisNode = thisNode.left;
   		}
   		else{
   			thisNode = thisNode.right;
   		}
   	}
   	return null;
   }
   
   //find account method, uses find node
   public Account findAccount(String username){
   	Node node = findNode(username);
   	if (node != null){
   		return node.account;
   	}
   	else{
   		return null;
   	}
   }
   
   /*
   //insert post function to particular user
   public void insertPost(String accountName, String fileName, String description, String likes){
   	Node<Account> account = search(accountName);
   	Post post = new Post(accountName, fileName, description, likes);
   	
   }*/
  
   public int getHeight ()
   {
      return getHeight (root);
   }   
   public int getHeight ( Node node )
   {
      if (node == null)
         return -1;
      else
         return 1 + Math.max (getHeight (node.getLeft ()), getHeight (node.getRight ()));
   }
   
   public int getSize ()
   {
      return getSize (root);
   }   
   public int getSize ( Node node )
   {
      if (node == null)
         return 0;
      else
         return 1 + getSize (node.getLeft ()) + getSize (node.getRight ());
   }
   
   public void visit (Node node)
   {
      System.out.println(node.getData());
   }
   
   public void preOrder ()
   {
      preOrder (root);
   }
   public void preOrder (Node node)
   {
      if (node != null)
      {
         visit (node);
         preOrder (node.getLeft ());
         preOrder (node.getRight ());
      }   
   }

   public void postOrder ()
   {
      postOrder (root);
   }
   public void postOrder (Node node)
   {
      if (node != null)
      {
         postOrder (node.getLeft ());
         postOrder (node.getRight ());
         visit (node);
      }   
   }

   public void inOrder ()
   {
      inOrder (root);
   }
   public void inOrder (Node node)
   {
      if (node != null)
      {
         inOrder (node.getLeft ());
         visit (node);
         inOrder (node.getRight ());
      }   
   }

   /*public void levelOrder ()
   {
      if (root == null)
         return;
      BTQueue<dataType> q = new BTQueue<dataType> ();
      q.enQueue (root);
      BinaryTreeNode<dataType> node;
      while ((node = q.getNext ()) != null)
      {
         visit (node);
         if (node.getLeft () != null)
            q.enQueue (node.getLeft ());
         if (node.getRight () != null)
            q.enQueue (node.getRight ());
      }
   }*/
}
