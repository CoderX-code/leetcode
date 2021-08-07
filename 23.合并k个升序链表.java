/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并K个升序链表
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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) {
            return null;
        } else if(lists.length == 1) {
            return lists[0];
        } else if(lists.length == 2) {
            return mergeTwoLists(lists[0],lists[1]);
        } else {
            ListNode[] leftLists = Arrays.copyOfRange(lists,0,lists.length/2);
            ListNode[] rightLists = Arrays.copyOfRange(lists,lists.length/2,lists.length);
            ListNode left = mergeKLists(leftLists);
            ListNode right = mergeKLists(rightLists); 
            return mergeTwoLists(left,right);
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = l1;
        ListNode current = dummyHead,p=l1,q=l2;
        while(p !=null && q !=null) {
            if(p.val <= q.val) {
                current.next = p;
                p = p.next;
            } else {
                current.next = q;
                q = q.next;
            }
            current = current.next;
        }
        if(p!=null) {
            current.next = p;
        } else {
            current.next = q;
        }
        return dummyHead.next;
    }
}
// @lc code=end

