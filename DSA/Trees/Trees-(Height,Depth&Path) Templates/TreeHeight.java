package Trees;

public class TreeHeight {
	int dfs(TreeNode root) {
	    if (root == null) return 0;   // base case
	    int left = dfs(root.left);
	    int right = dfs(root.right);
	    return 1 + Math.max(left, right);
	}
}
