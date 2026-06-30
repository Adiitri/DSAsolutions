/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */ //insert a value in bst
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp=root;

       if(root==null)
       return new TreeNode(val);

       while(temp!=null){
         if(val<temp.val){
            if(temp.left==null){
               temp.left=new TreeNode(val); 
               break;
            }
            temp=temp.left;
        }
        else{
            if(temp.right==null){
               temp.right=new TreeNode(val);  
               break;
            }
             temp=temp.right;
        }
       }
       return root;
    }
}
