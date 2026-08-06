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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        int carry = 0;
        
        while(l1 != null || l2 != null){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;

            if(sum/10 > 0){
                carry = sum/10;
                sum = sum%10;
            }
            else{
                carry = 0;
            }

            ListNode newnode = new ListNode(sum);
            curr.next = newnode;
            
            curr = curr.next;
            
        }

        if(carry != 0){
            ListNode newnode = new ListNode(carry);
            curr.next = newnode;
        }

        return ans.next;
    }
}