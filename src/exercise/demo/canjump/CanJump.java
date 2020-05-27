package exercise.demo.canjump;

import java.util.LinkedList;
import java.util.Queue;

public class CanJump {
    public boolean canJump(int[] nums) {
        Queue<Integer> que = new LinkedList<Integer>();
        que.add(0);
        int length = nums.length;
        if(length == 0){
            return true;
        }
        while(!que.isEmpty()){
            int index = que.poll();

            for(int i = 1; i <= nums[index]; i++){
                if(index + i == length - 1){
                    return true;
                }if(index + i >= length){
                    break;
                }
                que.add(index + i);
            }
        }
        return false;

    }
}
