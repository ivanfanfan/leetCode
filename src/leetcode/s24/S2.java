package leetcode.s24;

/**
 * TODO 递归的思想 源码
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 * 从链表的头节点 head 开始递归。
 * 每次递归都负责交换一对节点。由 firstNode 和 secondNode 表示要交换的两个节点。
 * 下一次递归则是传递的是下一对需要交换的节点。若链表中还有节点，则继续递归。
 * 交换了两个节点以后，返回 secondNode，因为它是交换后的新头。
 * 在所有节点交换完成以后，我们返回交换后的头，实际上是原始链表的第二个节点。
 *
 */
class S2 {
    public static void main(String[] args) {

    }
    public ListNode swapPairs(ListNode head) {

        // 递归结束的条件
        if ((head == null) || (head.next == null)) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}

