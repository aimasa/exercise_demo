package exercise.demo.rightsideview;

import exercise.demo.type.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> right = sideView(root.right);
        List<Integer> left = sideView(root.left);
        right.add(root.val);
        left.add(root.val);

        int leftLength = left.size();
        int rightLength = right.size();
        if(leftLength <= rightLength){
            Collections.reverse(right);
            return right;
        }
        int index = 0;
        List<Integer> result = new ArrayList<>();
        int indexRight  = 0;
        while(rightLength > indexRight){
            while (index < (leftLength - rightLength)){
                result.add(left.get(index));
                index++;}
            result.add(right.get(indexRight));
            indexRight++;
        }
        Collections.reverse(result);

        return result;




    }
    public List<Integer> sideView(TreeNode root){
        if(root == null){
            return new ArrayList<Integer>();
        }
        List<Integer> right = sideView(root.right);
        List<Integer> left = sideView(root.left);
        right.add(root.val);
        left.add(root.val);
        int leftLength = left.size();
        int rightLength = right.size();
        if(leftLength <= rightLength){
            return right;
        }
        int index = 0;
        List<Integer> result = new ArrayList<>();
        int indexRight  = 0;
        while(rightLength > indexRight){
            while (index < (leftLength - rightLength)){
                result.add(left.get(index));
                index++;}
            result.add(right.get(indexRight));
            indexRight++;
        }
        return result;

    }
}
