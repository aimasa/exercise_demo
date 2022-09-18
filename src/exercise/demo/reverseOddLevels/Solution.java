package exercise.demo.reverseOddLevels;

import java.util.HashMap;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

      public class TreeNode {
      int val;
      TreeNode left;TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    HashMap<Integer, Stack<Integer>> map = new HashMap<Integer, Stack<Integer>>();
    public TreeNode reverseOddLevels(TreeNode root) {
        deal(root, 0);
        change(root, 0);
        return root;

    }
    public void deal(TreeNode root, int deep){
        if(root == null){
            return;
        }
        if(deep % 2 == 0){
            Stack<Integer> subNode = map.getOrDefault(deep, new Stack<>());
            subNode.add(root.left.val);
            subNode.add(root.right.val);
            map.put(deep, subNode);
        }
        deal(root.left, deep + 1);
        deal(root.right, deep + 1);
    }

    public void change(TreeNode root, int deep){
        if(root == null){
            return;
        }
        if(deep % 2 == 0){
            Stack<Integer> subNode = map.get(deep);
            root.left.val = subNode.pop();
            root.right.val = subNode.pop();
            map.put(deep, subNode);
        }
        change(root.left, deep + 1);
        change(root.right, deep + 1);
    }
}