package java_practice;

public class Diameter_of_Binary_Tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
		  }
	public class Solution {
	    //global value
		int max=0;
	    public int diameterOfBinaryTree(TreeNode root) {
	        maxDepth(root);
	        return max;
	    }
	    public int maxDepth(TreeNode root){
	        if (root == null) return 0;
	        
	        int left = maxDepth(root.left);
	        int right = maxDepth(root.right);        
	        max = Math.max(max, left + right);
	        return Math.max(left, right) + 1;
	}
	}
}
