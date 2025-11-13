package Trees;

public class BooleanPathSum {
	public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        // Check if it's a leaf node
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        // Recur for left and right subtrees with reduced target
        int remaining = targetSum - root.val;
        return hasPathSum(root.left, remaining) || hasPathSum(root.right, remaining);
    }
}
