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
    public ListNode reverseKGroup(ListNode head, int k) {
        //check if k nodes exist
//         ListNode temp=head;
//         int cnt=0;

//         while(cnt<k)
//         {
//             if(temp==null)
//             return head;
//             cnt+=1;
//             temp=temp.next;

//         }

//         //recursively call for next nodes
//      ListNode prev=   reverseKGroup(temp,k);
//      //reverse each part
//      temp=head;
//      cnt=0;
//      while(cnt<k)
//      {
//         cnt+=1;

//      ListNode newNode=temp.next;
//      temp.next=prev;
//      prev=temp;
//      temp=newNode;
//      }
//      return prev;

     



//     }
    
// }
// check if k nodes exist 
int cnt=0;
ListNode temp=head;
while(cnt<k)
{
    if(temp==null)
    return head;


    cnt+=1;
    temp=temp.next;

}
// extract the node after the k group 
// recursive call lga do uske liye 


ListNode curr=head;
ListNode prev=null;


for(int i=0;i<k;i++)
{

    ListNode front=curr.next;
    curr.next=prev;
    prev=curr;
    curr=front;


}
 head.next = reverseKGroup(curr, k);

        // prev is the new head of this group
        return prev;

    }
}


