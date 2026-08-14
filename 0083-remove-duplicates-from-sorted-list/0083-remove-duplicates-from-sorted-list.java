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
        if(head==null||head.next==null) return head;
        ListNode pre=head,post=head.next;
        while(post!=null){
            if(pre.val==post.val){
                pre.next=post.next;
                post=post.next;
            }else{
            pre=post;
            post=post.next;
            }
        }
        return head;
    }
}