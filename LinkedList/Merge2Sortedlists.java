/*
 * Problem: Merge Two Sorted Linked Lists
 * Approach: Iterative, Two-Pointer Technique
 *
 * Explanation:
 * - We are given two sorted linked lists (list1, list2).
 * - If either list is null, return the other as the merged result.
 * - Use two pointers (p1, p2) to traverse both lists.
 * - Initialize the head (newNode) with the smaller of the first elements.
 * - Then, iteratively compare p1 and p2:
 *      -> Attach the smaller node to the merged list.
 *      -> Move the pointer of that list forward.
 * - Continue until one list is exhausted.
 * - Append the remaining nodes of the non-empty list to the merged result.
 *
 * Time Complexity: O(n + m) 
 *   where n = length of list1, m = length of list2
 * Space Complexity: O(1) 
 *   (no extra nodes created, only pointer adjustments)
 *
 * Example:
 * list1 = 1 -> 3 -> 4
 * list2 = 1 -> 2 -> 5
 * Result = 1 -> 1 -> 2 -> 3 -> 4 -> 5
 */
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode p1=list1,p2=list2,newNode=null;
        if(p1.val < p2.val){
            newNode=p1;
            p1=p1.next;
        }else{
            newNode=p2;
            p2=p2.next;
        }
        ListNode temp=newNode;
        while(p1!=null && p2!=null){
            if(p1.val < p2.val){
            temp.next=p1;
            p1=p1.next;
        }else{
            temp.next=p2;
            p2=p2.next;
        }
        temp=temp.next;
        }
        if(p1!=null) temp.next=p1;
        if(p2!=null) temp.next=p2;
        return newNode;
    }
}