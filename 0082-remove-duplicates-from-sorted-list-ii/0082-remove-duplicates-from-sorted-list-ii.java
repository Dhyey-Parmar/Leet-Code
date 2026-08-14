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
    public ListNode deleteDuplicates(ListNode head) {
              if (head == null || head.next == null) return head;

        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode pre = temp;
        ListNode post = head;

        while (post != null) {
            boolean duplicate = false;

            while (post.next != null && post.val == post.next.val) {
                duplicate = true;
                post = post.next;
            }

            if (duplicate) {
                pre.next = post.next;
            } else {
                pre = pre.next;
            }

            post = post.next;
        }

        return temp.next;
    }
}