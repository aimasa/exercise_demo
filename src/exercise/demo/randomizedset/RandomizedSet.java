package exercise.demo.randomizedset;

import exercise.demo.type.TreeNode;

import java.math.BigInteger;
import java.util.*;

public class RandomizedSet {
    /** Initialize your data structure here. */
    DoubleNode head;
    DoubleNode last;
    HashMap<Integer, DoubleNode> map;
    int size;



    public RandomizedSet() {
        head = new DoubleNode(0);
        last = head;
        map = new HashMap<>();

        size = 0;
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        DoubleNode nowNode = new DoubleNode(val);
        last.right = nowNode;
        nowNode.left = last;
        last = nowNode;
        map.put(nowNode.val, nowNode);
        size++;
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        DoubleNode deleNode = map.get(val);
        if(deleNode.right == null){
            last = deleNode.left;
            deleNode.left.right = null;
            deleNode.left = null;
        }
        else{
            DoubleNode left = deleNode.left;
            DoubleNode right = deleNode.right;
            left.right = right;
            right.left = left;
            deleNode.left = null;
            deleNode.right = null;
        }
        map.remove(val);
        size--;
        int num= 2;

        BigInteger n = new BigInteger(String.valueOf(num));



        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        Random random = new Random();
        int num = random.nextInt(size);
        DoubleNode temp = head;
        for(int i = 0; i < num; i++){
            temp = temp.right;
        }
        return temp.val;
    }
    public class DoubleNode{
        DoubleNode left;
        DoubleNode right;
        int val;
        public DoubleNode(int val){
            this.val = val;
        }



    }
}
