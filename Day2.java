/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {     
        //Time : O(1)
        //Space : O(1)
        node.val = node.next.val;
        node.next = node.next.next;
    }
}