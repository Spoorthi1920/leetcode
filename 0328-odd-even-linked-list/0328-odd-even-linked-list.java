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
    public ListNode oddEvenList(ListNode head) {
        ListNode  t1= new ListNode(-1);
        ListNode t2= new ListNode(-1);
        ListNode d1=t1,d2=t2;
        int cnt=1;
        while(head!=null){
            if(cnt%2!=0){
                d1.next=head;
                d1=d1.next;
            }
            else{
                d2.next=head;
                d2=d2.next;

            }
            cnt++;
            head=head.next;

        }
        d2.next=null;
        d1.next= t2.next;
        return t1.next;



        
    }
}