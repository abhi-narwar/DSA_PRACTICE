class delete_middle_node {
    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null)
            return null;   

        ListNode slow = head;
        ListNode fast = head;
        
        
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;       // 1 step
            fast = fast.next.next;  // 2 steps
        }

       
        prev.next = slow.next;

        return head;
    }
}
