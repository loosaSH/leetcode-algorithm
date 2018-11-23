package leetcode;

/**
 * Created by solie_h on 2018/11/23.
 */
public class LongestCommonPrefix14 {


    public static void main(String[] args){
        System.out.println(longestCommonPrefix(new String[]{}));
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length==0){
            return "";
        }

        int i=0;

        try {
            for (i=0; i < strs[0].length(); i++) {
                for (int j = 1; j < strs.length; j++) {
                    if (strs[j - 1].charAt(i) != strs[j].charAt(i)) {
                        return strs[0].substring(0,i);
                    }
                }
            }
        }catch (Exception e){
            return strs[0].substring(0,i);
        }


        return strs[0].substring(0,i);
    }
}
