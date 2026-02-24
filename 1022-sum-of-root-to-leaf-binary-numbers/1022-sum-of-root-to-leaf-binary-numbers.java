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
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) return 0;
        List<String> ls= new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        traversal(root, ls, sb);

        int sum = 0;
        for (String s : ls) {
            sum += Integer.parseInt(s, 2); // binary to int
        }
        return sum;
    }

    private void traversal(TreeNode node, List<String> ls, StringBuilder sb) {
        if (node == null) return;

       
        sb.append(node.val);

        
        if (node.left == null && node.right == null) {
            ls.add(sb.toString());
        } else {
            traversal(node.left, ls, sb);
            traversal(node.right, ls, sb);
        }
        sb.deleteCharAt(sb.length() - 1);
}
}