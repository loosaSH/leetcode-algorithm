package leetcode;

/**
 * Created by solie_h on 2018/12/17.
 */
public class MaxSubArray53 {


    public static int maxSubArray(int[] nums) {

        int res = nums[0];

        int sum = 0;


        for (int i = 0;i<nums.length;i++){
            if (sum>0){
                sum = sum+nums[i];
            }else {
                sum = nums[i];
            }

            res = Math.max(sum,res);
        }

        return res;
    }


    public static void main(String[] args){
        System.out.println(maxSubArray(new int[]{0,-1,-3,-4,-1,-2,-1,-5,-4}));
    }
}
