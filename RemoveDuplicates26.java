package leetcode;

/**
 * Created by solie_h on 2018/12/4.
 */
public class RemoveDuplicates26 {


    public static int removeDuplicates(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                index++;
                continue;
            }
            if (nums[i] == nums[index - 1]) {
                continue;
            }
            nums[index] = nums[i];
            index++;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return index;

    }


    public static void main(String[]args){
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
