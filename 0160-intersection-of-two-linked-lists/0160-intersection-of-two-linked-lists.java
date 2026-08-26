/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int findLength(ListNode head)
    {
        int c=0;

        ListNode temp=head;
        while(temp!=null)
        {
            c+=1;
            temp=temp.next;


        }
        return c;

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=findLength(headA);
        int len2=findLength(headB);
        ListNode temp1;
         ListNode temp2;


        if(len1>len2)
        {
            int d=len1-len2;
            temp1=headA;
          temp2=headB;


            while(d!=0)
            {
                d-=1;
                temp1=temp1.next;


            }
        }
        else{
             int d=len2-len1;
             temp1=headB;
             temp2=headA;


            while(d!=0)
            {
                d-=1;
                temp1=temp1.next;


            }

        }
        while(temp1!=null && temp2!=null)
        {
            if(temp1==temp2)
            return temp1;

            temp1=temp1.next;
            temp2=temp2.next;

        }
        return null;
        
        
    }
}