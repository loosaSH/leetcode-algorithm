package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1 TwoSum
 * Created by solie_h on 2018/11/4.
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            if (map.containsKey(j)) {
                return new int[] { map.get(j), i };

            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }


    public static void main(String[] args) {

        int [] nums = {2,7,11,15};

        int target = 10;

        int[] ints = twoSum(nums, target);

        if(ints.length>0){
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }else {
            System.out.println("无满足条件的两个数字");
        }



    }


}
