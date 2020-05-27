package exercise.demo.generatetrees;

import java.util.ArrayList;
import java.util.List;

import exercise.demo.type.TreeNode;

public class GenerateTrees {
	public List<TreeNode> generateTrees(int n) {
		List<TreeNode> treeNodes = geNodes(1, n);
		return treeNodes;
	}

	public List<TreeNode> geNodes(int start, int end) {
		List<TreeNode> treeNodes = new ArrayList<TreeNode>();
		if (start > end) {
			treeNodes.add(null);
			return treeNodes;
		}
		for(int i = start; i <= end; i++) {
			List<TreeNode> rightTreeNodes = geNodes(start, i - 1);
			List<TreeNode> leftTreeNodes = geNodes(i + 1, end);
			for(TreeNode righTree: rightTreeNodes) {
				for (TreeNode leftTree : leftTreeNodes) {
					TreeNode treeNode = new TreeNode(i);
					treeNode.right = righTree;
					treeNode.left = leftTree;
					treeNodes.add(treeNode);
				}
			}
		}
		return treeNodes;
	}
}
