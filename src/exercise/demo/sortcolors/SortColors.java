package exercise.demo.sortcolors;

public class SortColors {
    public void sortColors(int[] nums) {
        int p0 = 0;
        int p2 = nums.length - 1;
        int cor = 0;
        while(cor <= p2){
            if(nums[cor] == 0){
                int tmp = nums[cor];
                nums[cor] = nums[p0];
                nums[p0] = tmp;
                p0++;

            }
            else if(nums[cor] == 2){
                int tmp = nums[p2];
                nums[p2] = nums[cor];
                nums[cor] = tmp;
                p2--;
            }
            else{
                cor++;
            }
        }

    }



    public static void main(String[] args) {
        new SortColors().sortColors(new int[]{2,1,0,2,1,1,0});
    }
}
