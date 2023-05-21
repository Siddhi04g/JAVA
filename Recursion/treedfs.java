package Recursion;

public class treedfs {

    public class node{
        node left;
        node right;
        int val;
        node(int val){
            left = null;
            right = null;
            this.val = val;
        }
    }
    
    void inorder(node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val);
        inorder(root.right);
    }
    void preorder(node root){
        if(root == null){
            return;
        }
        System.out.print(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val);
    }
}
