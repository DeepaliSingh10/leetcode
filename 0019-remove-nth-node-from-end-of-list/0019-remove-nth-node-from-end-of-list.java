class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode curr = head;
        int size = 0;

        while (curr != null) {
            size++;
            curr = curr.next;
        }

        int count = size - n;

        if (count == 0) {
            return head.next;
        }

        ListNode temp = head;

        while (count > 1) {
            temp = temp.next;
            count--;
        }

        temp.next = temp.next.next;

        return head;
    }
}