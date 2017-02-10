package normal_practice;

// 从上往下建树，每个node的左右节点又是子树的
public class Array_to_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		return sortedArrayToBST(nums, 0, nums.length - 1);

	}

	public TreeNode sortedArrayToBST(int[] num, int start, int end) {
		if (start > end)
			return null;
 
		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(num[mid]);
		root.left = sortedArrayToBST(num, start, mid - 1);
		root.right = sortedArrayToBST(num, mid + 1, end);
 
		return root;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

	}
}
