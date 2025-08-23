/**
 * Definition for singly-linked list.
 * This class represents a node in the linked list.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

/**
 * Problem: Odd Even Linked List
 * 
 * Given the head of a singly linked list, group all the nodes with odd indices together 
 * followed by the nodes with even indices, and return the reordered list.
 * 
 * Example:
 * Input:  1 -> 2 -> 3 -> 4 -> 5
 * Output: 1 -> 3 -> 5 -> 2 -> 4
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        // Base case: if the list is empty or has only one node
        // no rearrangement is required.
        // if (head == null || head.next == null) return head;

        // Dummy nodes to simplify odd and even list handling
        ListNode ohead = new ListNode(-1);  // odd list head (dummy)
        ListNode ehead = new ListNode(-1);  // even list head (dummy)

        // Pointers to track odd and even lists
        ListNode slow = ohead;  
        ListNode fast = ehead;

        // Traverse the linked list and separate nodes into odd/even lists
        while (head != null) {
            // Add the current node to the odd list
            slow.next = head;
            slow = slow.next;

            // If there's a next node, add it to the even list
            if (head.next != null) {
                fast.next = head.next;
                head = head.next.next;
                fast = fast.next;
            } else {
                head = head.next;
            }
        }

        // Terminate even list properly
        fast.next = null;

        // Link odd list to even list
        slow.next = ehead.next;

        // Return the new head (skipping dummy node)
        return ohead.next;     
    }
}
