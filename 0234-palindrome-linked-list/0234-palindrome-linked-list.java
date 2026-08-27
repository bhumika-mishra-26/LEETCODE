class Solution {

    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode temp = head;

        while(temp != null)
        {
            ListNode front = temp.next;

            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }

    public ListNode findMiddle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head)
    {
        if(head == null || head.next == null)
            return true;

        // middle se pehle wala node
        ListNode midd = findMiddle(head);

        // second half ka head
        ListNode sec_midd = midd.next;

        // list split
        midd.next = null;

        // second half reverse
        ListNode new_head = reverse(sec_midd);

        // compare
        ListNode p = head;

        while(p != null && new_head != null)
        {
            if(p.val != new_head.val)
                return false;

            p = p.next;
            new_head = new_head.next;
        }

        return true;
    }
}