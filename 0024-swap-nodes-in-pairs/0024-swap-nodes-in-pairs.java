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
    public ListNode swapPairs(ListNode head) {
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode pre=temp;
        while(pre.next != null && pre.next.next != null){
            ListNode first = pre.next;
            ListNode second = first.next;

            first.next = second.next;
            second.next = first;
            pre.next = second;

            pre = first;
        }
        return temp.next;
    }
}