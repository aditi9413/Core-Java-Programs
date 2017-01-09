package Tree;

public class MaxNodeOfTree {
   static Node root;
  public MaxNodeOfTree(){
	   root=null;
   }
  public static int MaxNode(Node root){
	  if(root==null)
		  return Integer.MAX_VALUE;
	  int max = root.key;
	    int lmax = MaxNode(root.left);
	    int rmax = MaxNode(root.right);
	    if (lmax > max)
	      max = lmax;
	    if (rmax > max)
	      max = rmax;
	    return max;
  }
	public static void main(String[] args) {
		MaxNodeOfTree tree = new MaxNodeOfTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("Maximum of binary tree is " +tree.MaxNode(root));

	}

}
