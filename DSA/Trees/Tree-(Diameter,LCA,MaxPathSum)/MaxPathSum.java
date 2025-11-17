package Trees;

public class MaxPathSum {
	 int sum = Integer.MIN_VALUE;
	    public int maxPathSum(TreeNode root) {
	        dfs(root);
	        return sum;
	    }
	    public int dfs(TreeNode root){
	        if(root==null) return 0;
	        int left = Math.max(0,dfs(root.left));
	        int right = Math.max(0,dfs(root.right));
	        sum = Math.max(sum,(left+root.val+right));
	        return root.val+Math.max(left,right);
	    }
}
