package leetcode;

/**
 * Created by solie_h on 2018/12/22.
 */
public class LengthOfLastWord58 {

    public static int lengthOfLastWord(String s) {

        String[] a = s.split(" ");
        if (a.length>0){
            return a[a.length-1].length();
        }else {
            return 0;
        }
    }

    public static void main (String[] args){
        System.out.println(lengthOfLastWord(" "));
    }



}
