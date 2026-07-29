class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;

        ArrayList<Integer> arr = new ArrayList<>();


        ListNode temp = head;
        while (temp != null) {
            arr.add(temp.val);
            if (temp.next == null)
                break;
            temp = temp.next.next;
        }

        temp = head.next;
        while (temp != null) {
            arr.add(temp.val);
            if (temp.next == null)
                break;
            temp = temp.next.next;
        }

       
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        return dummy.next;
    }
}