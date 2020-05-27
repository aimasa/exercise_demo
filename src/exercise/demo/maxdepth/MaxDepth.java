package exercise.demo.maxdepth;

import exercise.demo.type.TreeNode;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
    	int leftLength = maxDepth(root.left) + 1;
    	int rightLength = maxDepth(root.right) + 1;
		return Math.max(leftLength, rightLength);

    }
}
