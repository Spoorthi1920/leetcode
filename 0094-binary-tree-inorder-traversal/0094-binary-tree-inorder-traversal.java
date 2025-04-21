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
 */
class Solution {
     protected List<Integer> lst = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
       

        inorderTrav(root);

        return lst;
        
    }
    private void inorderTrav(TreeNode root){
        if(root==null){ 
        return;
        }
        inorderTrav(root.left);
        lst.add(root.val);
        inorderTrav(root.right);


    }
}