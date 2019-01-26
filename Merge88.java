package leetcode;

/**
 * Created by solie_h on 2019/1/26.
 */
public class Merge88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m;i<m+n;i++){
            nums1[i] = nums2[i-m];
        }

        bubbleSort(nums1);

    }



    public static void bubbleSort(int []arr) {
        for(int i =0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-i-1;j++) {//-1为了防止溢出
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];

                    arr[j]=arr[j+1];

                    arr[j+1]=temp;
                }
            }
        }
    }

}
