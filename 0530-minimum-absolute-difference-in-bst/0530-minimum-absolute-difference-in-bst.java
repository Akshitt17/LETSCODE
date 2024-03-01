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
    int min;
    int prev=-1;
    public int getMinimumDifference(TreeNode root) {
        
        min=Integer.MAX_VALUE;
        helper(root);
        return min;
    }
    void helper(TreeNode node ){
        if(node==null) return;
        
        
        helper(node.left);
        if(prev!=-1)
        min=Math.min(min,Math.abs(prev-node.val));
        prev=node.val;
        helper(node.right);
        
    }
}