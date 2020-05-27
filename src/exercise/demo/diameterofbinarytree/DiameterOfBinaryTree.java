package exercise.demo.diameterofbinarytree;

import java.awt.geom.AffineTransform;

import exercise.demo.type.TreeNode;

public class DiameterOfBinaryTree {
	int ans;
	public int diameterOfBinaryTree(TreeNode root) {
		ans = 0;

		return lengthTree(root);

	}

	public int lengthTree(TreeNode root) {
		if (root== null) {
			return -1;
		}
		int leftLength = lengthTree(root.left);
		int rightLength = lengthTree(root.right);
		ans = Math.max(ans, leftLength + rightLength + 1);
		int maxLength = Math.max(leftLength, rightLength) + 1;

		return maxLength;

	}
}
