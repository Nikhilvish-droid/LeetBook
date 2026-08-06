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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 1;
        ListNode curr = head;
        while(curr.next != null){
            length++;
            curr = curr.next;
        }
        int pos = length - n;

        if(pos == 0){
            return head.next;
        }

        int index = 0;
        curr = head;
        while(index + 1 < pos){
            index++;
            curr = curr.next;
        }

        curr.next = curr.next.next;
        return head;

    }
}