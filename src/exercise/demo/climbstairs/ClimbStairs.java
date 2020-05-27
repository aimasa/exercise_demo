package exercise.demo.climbstairs;

public class ClimbStairs {
    public int climbStairs(int n) {
    	int result = calculateStep(n , 0);
		return result;
        
    }
    //这个方法会导致重复计算一些值，比如"calculateStep(n, i + 2)"已经计算过的值"calculateStep(n, i + 1)"
    //会在递归时候重复计算，而产生不必要的冗余值。这些时间是可以省下来的
    public int calculateStep(int n , int i) {
    	if(i == n) {
    		return 1;
    	}
    	if(i > n) {
    		return 0;
    	}
    	return calculateStep(n, i + 1) + calculateStep(n, i + 2);
    }
}
