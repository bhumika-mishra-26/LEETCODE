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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
        return null;
           int len=0;
      
        ListNode temp=head;
        while(temp!=null)
        {
            len+=1;
            temp=temp.next;

        }
        if(len==n)
        return head.next;
        temp=head;

        int dist=len-n;
        int cnt=0;

        while(cnt<dist-1)
        {
            cnt+=1;
            temp=temp.next;


        }
        if(temp.next==null)
        return head;
        temp.next=temp.next.next;
        return head;


        
    }
}