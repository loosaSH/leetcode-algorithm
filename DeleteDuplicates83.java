package leetcode;

/**
 * Created by solie_h on 2019/1/26.
 */
public class DeleteDuplicates83 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
//         if(head != null && head.next == null){
//             return head;
//         }

//         if(head.next.val == head.val){
//             head.next = head.next.next;
//         }
//         return deleteDuplicates(head);
        ListNode head1 = head;

        while(head1!=null&&head1.next!=null){
            if(head1.next.val == head1.val){
                head1.next = head1.next.next;
            }else{
                head1 = head1.next;
            }
        }
        return head;
    }
}
