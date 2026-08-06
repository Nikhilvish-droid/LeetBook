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

        if (head == null) return null;

        ListNode ans = new ListNode(head.val);
        ListNode anscurr = ans;

        ListNode curr = head.next;

        while(curr != null){
            if(anscurr.val != curr.val){
                ListNode newnode = new ListNode(curr.val);
                anscurr.next = newnode;
                anscurr = anscurr.next;
            }

            curr = curr.next;
        }

        return ans;
    }
}