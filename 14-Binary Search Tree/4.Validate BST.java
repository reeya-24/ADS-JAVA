//leetcode 98
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
//tc->o(n),sc->o(1)
class Solution {
    public boolean solve(TreeNode root,long min,long max){
        // base cases
        if(root==null)return true;
        if(root.val>=max || root.val<=min)return false;
        boolean x=solve(root.left,min,root.val);
        boolean y=solve(root.right,root.val,max);
        return x&&y;
    }
    public boolean isValidBST(TreeNode root) {
        return solve(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}
