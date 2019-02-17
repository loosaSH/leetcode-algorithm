package leetcode;

import java.util.List;

/**
 * Created by solie_h on 2019/2/17.
 */
public class addTwoNumbers2 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode l3 = null;
        ListNode l4 = null;
        boolean plusOne = false;

        while (l1 != null || l2 != null) {

            if (l3 == null) {
                l3 = new ListNode(0);
            } else {
                l3.next = new ListNode(0);
                l3 = l3.next;
            }

            if (plusOne) {
                l3.val = l3.val + 1;
                plusOne = false;
            }

            if (l1 == null) {
                l3.val += l2.val;
                l2 = l2.next;
            } else if (l2 == null) {
                l3.val += l1.val;
                l1 = l1.next;
            } else {
                l3.val += l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;

            }

            if (l3.val >= 10) {
                plusOne = true;
                l3.val = l3.val % 10;
            }

            if (l4 == null){
                l4 = l3;
            }

        }

        if (plusOne) {
            l3.next = new ListNode(1);
        }


        return l4;

    }


    public static void main(String[] args) {
        ListNode l1_1 = new ListNode(9);
        ListNode l1_2 = new ListNode(8);
//        ListNode l1_3 = new ListNode(3);
        ListNode l2_1 = new ListNode(1);
//        ListNode l2_2 = new ListNode(6);
//        ListNode l2_3 = new ListNode(4);
        l1_1.next = l1_2;
//        l1_2.next = l1_3;
//        l2_1.next = l2_2;
//        l2_2.next = l2_3;

        addTwoNumbers(l1_1, l2_1);
    }


}
