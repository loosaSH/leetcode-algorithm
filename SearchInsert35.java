package leetcode;

/**
 * Created by solie_h on 2018/12/15.
 */
public class SearchInsert35 {

    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums,target));
    }

    public static int searchInsert(int[] nums, int target) {

        int i;

        for (i = 0;i<nums.length;i++){
            if (target<=nums[i]){
                return i;
            }
        }
        return i;

    }
}
