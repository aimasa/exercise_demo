package exercise.demo.buildtree;

import exercise.demo.type.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return buildTreeHelper(preorder, 0, preorder.length, inorder, map, 0);
    }
    public TreeNode buildTreeHelper(int[] preorder, int pStart, int pEnd, int[] inorder, HashMap<Integer, Integer> map, int iStart){
        if(pStart == pEnd){
            return null;
        }
        int rootVal = preorder[pStart];
        TreeNode root = new TreeNode(rootVal);
        int midLength = map.get(rootVal);
        int leftNum = midLength - iStart;
        TreeNode left = buildTreeHelper(preorder, pStart + 1, pStart + leftNum + 1, inorder, map, iStart);
        TreeNode right = buildTreeHelper(preorder, pStart + leftNum + 1, pEnd, inorder, map, iStart);
        root.left = left;
        root.right = right;
        return root;
    }
}
