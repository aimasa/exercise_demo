package exercise.demo.treebased;

import exercise.demo.type.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> que = new LinkedList<>();
        List<Integer> nodes = new ArrayList<Integer>();
        nodes.add(root.val);
        result.add(nodes);
        que.add(root);
        while(que != null){
            int length = que.size();
            nodes = new ArrayList<>();
            for(int i = 0; i < length; i++){
                TreeNode node = que.poll();
                if(node.left != null){que.add(node.left); nodes.add(node.left.val);}
                if(node.right != null){que.add(node.right);nodes.add(node.left.val);}
            }
            result.add(nodes);
        }
        return result;

    }
}
