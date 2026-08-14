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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
        return head;
        ListNode temp=head;
        int count=1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }

         k = k % count;

        if (k == 0)
            return head;

        temp.next=head;
        ListNode pre=null;
        for(int i=0;i<count-k;i++){
            pre=head;
            head=head.next;
        }
        pre.next=null;
        return head;
    }
}