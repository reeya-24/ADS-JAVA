//leetcode 25
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
    public static ListNode reverseList(ListNode head, ListNode kplus1) {
        if(head==null || head.next==null)
            return head;
        
        ListNode prev=null;
        ListNode curr=head;
        
        while(curr!=kplus1){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null)
            return head;
        ListNode kplus1=head;
        for(int i=1; i<=k; i++){
            if(kplus1==null)
                return head;
            kplus1=kplus1.next;
        }
        ListNode ans = reverseList(head,kplus1);
        head.next = reverseKGroup(kplus1,k);
        return ans;
    }
}
