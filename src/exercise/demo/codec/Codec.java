package exercise.demo.codec;

import exercise.demo.type.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        result.add(root);
        int index = 0;
        while (index < result.size()) {
            TreeNode tmp = result.get(index);
            if (tmp == null) {
                sb.append(" ");
                sb.append("|");
                index++;
                continue;
            }
            sb.append(tmp.val);
            sb.append("|");
            result.add(tmp.left);
            result.add(tmp.right);
            index++;
        }
        return sb.toString();
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arrayData = data.split("\\|");
        TreeNode[] treeNodes = new TreeNode[arrayData.length];
        for (int i = 0; i < arrayData.length; i++) {
            if (arrayData[i] == null) {
                treeNodes[i] = null;
            } else {
                treeNodes[i] = new TreeNode(Integer.parseInt(arrayData[i]));
            }
        }
        int index = 0;
        int left = 1;
        int right = 2;
        toTreeNode(treeNodes, left, right, index);


        return treeNodes[0];
    }
    private void toTreeNode(TreeNode[] treeNodes, int left, int right, int cor){
        if(left >= treeNodes.length){
            return;
        }

        if(treeNodes[cor] == null){
            toTreeNode(treeNodes, left, right, cor++);
        }
        else {
            treeNodes[cor].left = treeNodes[left];
            treeNodes[cor].right = right < treeNodes.length ? treeNodes[right] : null;
            toTreeNode(treeNodes, right + 1, right + 2, cor++);
        }
    }

}
