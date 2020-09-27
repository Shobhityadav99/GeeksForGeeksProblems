package GFG;

public class fixingtwonodesofBST {
	static Node prev=null;
    static Node first=null;
    static Node last=null;
    static void correct(Node root){
        if(root==null)
     return;
     correct(root.left);
     if(prev!=null && root.data<prev.data){
         if(first==null)
         first=prev;
         last=root;
     }
     prev=root;
     correct(root.right);
    }
    static void swap(Node root1,Node root2){
        int temp=root1.data;
        root1.data=root2.data;
        root2.data=temp;
    }
    public Node correctBST(Node root)
    {
     prev=null;
     first=null;
     last=null;
     correct(root);
     swap(first,last);
     return root;
    }
}
