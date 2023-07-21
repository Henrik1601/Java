import java.util.*;
public class BinaryTree {
    class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int data){
            this.data=data;
            left=right=null;
        }
    }
    TreeNode root=null;
    public void insert(int data){
        root=insertNode(root,data);
    }
    TreeNode insertNode(TreeNode root,int data){
        if (root == null) {
            root = new TreeNode(data);
            return root;
        } else if (data < root.data) {
            root.left = insertNode(root.left,data);
        } else {
            root.right = insertNode(root.right,data);
        }
        return root;
    }
    public void inorder(TreeNode root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        Scanner s= new Scanner(System.in);
        for(int i=0;i<5;i++){
            int data=s.nextInt();
            tree.insert(data);
        }
        tree.inorder(tree.root);
    }
}
