package exercise.demo.minimumtotal;

import java.util.ArrayList;
import java.util.List;

public class Demo {
public static void main(String[] args) {
	MinimumTotal minimumTotal = new GreaterMinimumTotal();
	int[] test1 = new int[] {2};
	List<Integer> instact1 = new ArrayList<Integer>();
	instact1.add(2);
	List<List<Integer>> triangle = new ArrayList<List<Integer>>();
	triangle.add(instact1);
	List<Integer> instact2 = new ArrayList<Integer>();
	instact2.add(3);
	instact2.add(4);
	List<Integer> instact3 = new ArrayList<Integer>();
	instact3.add(5);
	instact3.add(6);
	instact3.add(7);
	triangle.add(instact2);
	triangle.add(instact3);
	minimumTotal.minimumTotal(triangle);
}
}
