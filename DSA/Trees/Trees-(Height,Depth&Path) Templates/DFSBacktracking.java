package Trees;

import java.util.ArrayList;
import java.util.List;

public class DFSBacktracking {
	 public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
	        List<List<Integer>> result = new ArrayList<>();
	        dfs(root,targetSum,result,new ArrayList<>());
	        return result;
	    }
	    public void dfs(TreeNode root,int targetSum,List<List<Integer>> result,List<Integer> temp){
	        if(root==null) return;
	        temp.add(root.val);
	        if(root.left==null&&root.right==null&&root.val==targetSum){
	            result.add(new ArrayList<>(temp));
	        }else{
	            dfs(root.left,targetSum-root.val,result,temp);
	            dfs(root.right,targetSum-root.val,result,temp);
	        }
	        temp.remove(temp.size()-1);
	    }
}
