/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
 */

// @lc code=start
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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dirtyHead = new ListNode(0);
        dirtyHead.next = head;
        ListNode quick = dirtyHead,slow = dirtyHead;
        while(n>0 && quick.next!=null) {
            quick = quick.next;
            n--;
        }
        while(quick.next!=null) {
            slow = slow.next;
            quick = quick.next;
        }
        slow.next = slow.next.next;
        return dirtyHead.next;
    }
}
// @lc code=end

