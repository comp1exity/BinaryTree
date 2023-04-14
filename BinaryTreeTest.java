// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman

public class BinaryTreeTest
{
   public static void main ( String [] args )
   {
      BinarySearchTree bt = new BinarySearchTree ();
   
/*
      // test for single node
      bt.root = new BinaryTreeNode<Integer> (10, null, null);
*/      
   
/*
      // test for 2-level tree
      bt.root = new BinaryTreeNode<Integer> (
          1, 
          new BinaryTreeNode<Integer> (2, null, null),
          new BinaryTreeNode<Integer> (3, null, null)
      );
     


      // test for 3-level tree
      bt.root = new Node (
          1, 
          new Node (
            2, 
            new Node (
              4, 
              null, 
              null
            ), 
            new Node (
              5, 
              null, 
              null
            )
          ),
          new Node (
            3, 
            new Node (
              6, 
              null, 
              null
            ), 
            null
          )
         );   
    */ 
    
    Account account1 = new Account("nic","is a top G.");
    Account account2 = new Account("sam","is a bottom G.");
    Node<Account> node = new Node<Account>(account1, null, null);
    bt.insert(account1);
    bt.insert(account2);
    

      System.out.println ("Height : " + bt.getHeight ());
      System.out.println ("Size : " + bt.getSize ());
      System.out.println ("Inorder : ");
      bt.inOrder ();
      System.out.println ("Preorder : ");
      bt.preOrder ();
      System.out.println ("Postorder : ");
      bt.postOrder ();
      System.out.println ("Level order : ");
      //bt.levelOrder ();
   }
}
