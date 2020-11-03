package exercise.demo.zigzaglevelorder;

import exercise.demo.type.TreeNode;

import java.util.*;

public class ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        List<Integer> temp = new ArrayList<>();
        temp.add(root.val);
        result.add(temp);
        int count = 0;
        while (que.size() > 0) {
            count++;
            List<Integer> list = new ArrayList<>();
            int size = que.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = que.poll();
                if (node.left != null) {
                    list.add(node.left.val);
                    que.add(node.left);
                }
                if (node.right != null) {
                    list.add(node.right.val);

                    que.add(node.right);
                }
            }
            if(list.size() > 0){
                if (count % 2 == 1) {
                    Collections.reverse(list);
                }
                result.add(list);}
        }
        return result;


    }
}
