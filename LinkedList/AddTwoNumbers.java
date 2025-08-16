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
        // Create a dummy node to simplify result list construction
        ListNode dummy = new ListNode();
        
        // 'res' keeps the reference to the head of the result list
        ListNode res = dummy;
        
        // Variables to hold sum and carry during addition
        int total = 0, carry = 0;

        // Continue looping until both lists are fully traversed and no carry remains
        while (l1 != null || l2 != null || carry != 0) {
            // Start each addition with the previous carry
            total = carry;

            // Add value from l1 if available
            if (l1 != null) {
                total += l1.val;
                l1 = l1.next;  // Move to the next node in l1
            }

            // Add value from l2 if available
            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;  // Move to the next node in l2
            }

            // Compute digit and carry
            int num = total % 10;   // Current digit
            carry = total / 10;     // Carry for next iteration

            // Append the new digit node to the result list
            dummy.next = new ListNode(num);
            dummy = dummy.next;  // Move pointer forward in result list
        }

        // Return the head of the result list (skipping dummy)
        return res.next;
    }
}
