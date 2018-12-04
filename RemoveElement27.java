package leetcode;

/**
 * Created by solie_h on 2018/12/4.
 */
public class RemoveElement27 {


    public static int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i]==val){
                continue;
            }

            nums[index]=nums[i];
            index++;

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return index;

    }

    public static void main(String[]args){
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
}
