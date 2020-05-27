package exercise.demo.climbstairs;

public class OtherClimbStairs {
    public int climbStairs(int n) {
        int[] maxStep = new int[n + 1];
        if(maxStep.length-1 == 0){return 0;}
        if(maxStep.length-1 == 1){return 1;}
        maxStep[0] = 0;
        maxStep[1] = 1;
        maxStep[2] = 2;
        
        for(int i = 3; i < maxStep.length; i++){
            maxStep[i] = maxStep[i - 1] + maxStep[i - 2];
        }
        

		return maxStep[n];
    
    }
}
