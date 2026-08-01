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

        if (head == null)
            return null;

        int[] freq = new int[201];

        ListNode temp = head;

        while (temp != null) {
            freq[temp.val + 100]++;
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        for (int i = 0; i < 201; i++) {
            if (freq[i] == 1) {
                tail.next = new ListNode(i - 100);
                tail = tail.next;
            }
        }

        return dummy.next;
    }
}