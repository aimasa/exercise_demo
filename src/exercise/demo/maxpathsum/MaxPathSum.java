package exercise.demo.maxpathsum;

import exercise.demo.type.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MaxPathSum {
    int maxCount = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int count = pathSum(root);


        return maxCount > count ? maxCount : count;
    }

    public int pathSum(TreeNode root) {
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int count = root.val;
        int leftCount = pathSum(root.left);
        System.out.println("leftCount : " + leftCount);
        int rightCount = pathSum(root.right);
        System.out.println("rightCount : " + rightCount);
        int result = count;
        int cor = count;
        if(leftCount != Integer.MIN_VALUE){

            result = Math.max(count, count + leftCount);
            cor += leftCount;
        }
        if(rightCount != Integer.MIN_VALUE){

            cor += rightCount;
            result = Math.max(result, count + rightCount);
        }

        maxCount = Math.max(cor, maxCount);

        // maxCount = Math.max(maxCount, count + rightCount + leftCount);
        System.out.println("cor : " + cor);
        System.out.println("maxCount : " + maxCount);
        System.out.println("result : " + result);


        return result;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String val = br.readLine();
        String num = br.readLine();
        TreeNode root = new TreeNode(Integer.valueOf(val));
        Queue<TreeNode> queNode = new LinkedList<>();
        queNode.add(root);
        for(int i = 0; i < Integer.valueOf(num); i++){
            TreeNode nodeNum = queNode.poll();
            String leftNodeNum = br.readLine();
            if(!leftNodeNum.isEmpty()){
                TreeNode leftNode = new TreeNode(Integer.valueOf(leftNodeNum));
                nodeNum.left = leftNode;
                queNode.add(leftNode);
            }
            String rightNodeNum = br.readLine();
            if(!rightNodeNum.isEmpty()){
                TreeNode rightNode = new TreeNode(Integer.valueOf(rightNodeNum));
                nodeNum.right = rightNode;
                queNode.add(rightNode);
            }
        }
        new MaxPathSum().maxPathSum(root);

    }
}