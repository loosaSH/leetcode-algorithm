package leetcode;

/**
 * Created by solie_h on 2018/11/9.
 */
public class LinkedListDeleteDuplicates83 {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(2);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;



    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
