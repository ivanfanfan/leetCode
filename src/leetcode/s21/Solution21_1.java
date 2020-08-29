package leetcode.s21;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class Solution21_1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preprev =new ListNode(-1);
        ListNode prev = preprev;
        while(l1!= null && l2!= null){
            if(l1.val>l2.val){
                prev.next = l2;
                l2 = l2.next;
            }else {
                prev.next = l1;
                l1 = l1.next;
            }
            prev = prev.next;
        }
        prev.next = l1==null?l2:l1;
        return preprev.next;
    }

}
