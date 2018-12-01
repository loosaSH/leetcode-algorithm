package leetcode;

import java.util.logging.Level;

/**
 * Created by solie_h on 2018/12/1.
 */
public class MergeTwoLists21 {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null){
            return l2;
        }

        if (l2 == null){
            return l1;
        }

        ListNode mListNode;

        if (l1.val>l2.val){
            mListNode = new ListNode(l2.val);
            mListNode.next = mergeTwoLists(l1,l2.next);
        }else {
            mListNode = new ListNode(l1.val);
            mListNode.next = mergeTwoLists(l1.next,l2);
        }
        return mListNode;
    }


}
