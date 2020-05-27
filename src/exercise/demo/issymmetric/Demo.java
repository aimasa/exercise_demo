package exercise.demo.issymmetric;

import exercise.demo.type.TreeNode;

public class Demo {
	public static void main(String[] args) {
		TreeNode tr1 = new TreeNode(1);
		TreeNode tr2 = new TreeNode(2);
		tr1.left = tr2;
		TreeNode tr3 = new TreeNode(2);
		tr1.right = tr3;
		TreeNode tr4 = new TreeNode(3);
		tr2.left = tr4;
		TreeNode tr5 = new TreeNode(5);
		tr2.right = tr5;
		TreeNode tr6 = new TreeNode(4);
		tr3.left = tr6;
		TreeNode tr7 = new TreeNode(3);
		tr3.right = tr7;
		new IsSymmetric().isSymmetric(tr1);

	}
}
