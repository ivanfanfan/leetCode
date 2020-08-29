package leetcode.s21;

import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Solution21 {
    public static void main(String[] args) {
        Deque deque;
        Queue queue;
        Stack stack;
    }

    class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = l1;
         while(l3.next!=null){
             if(l1.val<l2.val){
                 l3=l1.next;
                 l1.next = l2;
             }
         }
        return null;
     }
}
