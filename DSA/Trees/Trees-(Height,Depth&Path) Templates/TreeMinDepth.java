package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeMinDepth {
	int dfs(TreeNode root) {
	    if (root == null) return 0;   // base case
	    int left = dfs(root.left);
	    int right = dfs(root.right);
	    if(root.left==null) return 1+dfs(root.right);
	    if(root.right==null) return 1+dfs(root.left);
	    return 1 + Math.min(left, right);
	}
	
	int bfs(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 1; // Start counting levels from 1 (root level)

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                // 🟢 If it's a leaf node, we found the minimum depth
                if (node.left == null && node.right == null) {
                    return depth;
                }

                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            depth++; // move to the next level
        }

        return depth;
    }
}
