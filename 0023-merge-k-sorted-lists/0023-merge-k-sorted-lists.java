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
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans=new ListNode();
        ListNode temp=new ListNode();
        temp=ans;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                ans.next=list1;
                list1=list1.next;
            }else{
                ans.next=list2;
                list2=list2.next;
            }
            ans=ans.next;
        }
        
            if(list1!=null){
                ans.next=list1;
                ans=ans.next;
            }
            if(list2!=null){
                ans.next=list2;
                ans=ans.next;
            }
        return temp.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;

        ListNode ans = lists[0];

        for (int i = 1; i < lists.length; i++) {
            ans = mergeTwoLists(ans, lists[i]);
        }

        return ans;
    }
}