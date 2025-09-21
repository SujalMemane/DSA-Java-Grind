class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode prevGroupEnd = dummy;
        ListNode curr = head;

        while (true) {

            ListNode temp = curr;
            for (int i = 0; i < k; i++) {
                if (temp == null) return dummy.next;
                temp = temp.next;
            }

            ListNode prev = null;
            ListNode node = curr;
            for (int i = 0; i < k; i++) {
                ListNode next = node.next;
                node.next = prev;
                prev = node;
                node = next;
            }

            prevGroupEnd.next = prev;
            curr.next = node; 
            prevGroupEnd = curr;
            curr = node;
        }
    }
}
