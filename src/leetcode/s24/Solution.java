package leetcode.s24;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode current = dummy;
        while(current.next != null && current.next.next != null){
            ListNode n1 = current.next;
            ListNode n2 = current.next.next;

            //操作
            current.next = n2;
            n2.next = n1;
            n1.next = n2.next;
            current = n1;
        }
        return dummy.next;
    }
}
