package exercise.demo.issymmetric;

import javax.swing.RootPaneContainer;

import exercise.demo.type.TreeNode;

public class IsSymmetric {   

	public boolean isSymmetric(TreeNode root) {
		if(root == null) {
			return true;
		}
		return compare(root, root);

	}

	public Boolean compare(TreeNode leftTree, TreeNode rightTree) {
		if(leftTree == null && rightTree == null) {	
			return true;
		}
        if(leftTree == null || rightTree == null){
            return false;
        }
		return (leftTree.val == rightTree.val) && compare(leftTree.left, rightTree.right)
				   && compare(leftTree.right, rightTree.left);

	}
}
