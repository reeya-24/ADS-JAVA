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
    ListNode start;
    public boolean palindrome(ListNode head) {
        if(head==null)
            return true;
        boolean x = palindrome(head.next);
        if(x){
            if(start.val!=head.val)
                return false;
            else{
                start=start.next;
                return true;
            }
        }
        return x;
    }
    public boolean isPalindrome(ListNode head) {
        start=head;
        return palindrome(head);
    }
}
