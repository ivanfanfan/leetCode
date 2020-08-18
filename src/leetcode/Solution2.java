package leetcode;


import sun.security.x509.InvalidityDateExtension;

/**
 * 给出两个 非空 的链表用来表示两个  非负 的 整 数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *  * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *  * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *  *
 *  * 示例：
 *  * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 *  * 输出：7 -> 0 -> 8
 *  * 原因：342 + 465 = 807
 *  *
 *  *  * Definition for singly-linked list.
 *  *  * public class ListNode {
 *  *     int val;
 *  *     ListNode next;
 *  *     ListNode(int x) { val = x; }
 *  * }
 *
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);//头结点用来最后遍历链表
        ListNode curr = dummy;  //用来添加数据
        int carry = 0;   //记录进位
        while (l1!=null||l2!=null){
            int sum = 0;
            if(l1!=null){
                sum +=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum +=l2.val;
                l2 = l2.next;
            }
            sum += carry;
            curr.next = new ListNode(sum%10);
            carry =sum/10;
            curr = curr.next;
        }
        if(carry>0){
            curr.next = new ListNode(carry);
        }
        return dummy.next;
    }
}

