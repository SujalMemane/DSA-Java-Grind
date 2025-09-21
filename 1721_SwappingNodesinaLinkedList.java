class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        ListNode temp = head;
        
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        
        ListNode kthFromStart = first;
        
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        
        int tmpVal = kthFromStart.val;
        kthFromStart.val = second.val;
        second.val = tmpVal;
        
        return head;
    }
}
