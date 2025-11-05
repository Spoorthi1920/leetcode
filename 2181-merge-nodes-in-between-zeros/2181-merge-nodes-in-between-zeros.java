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
    public ListNode mergeNodes(ListNode head) {
        int cnt=0,sum=0;
        ListNode newList = new ListNode(0);
        ListNode dummy = newList;
        while(head!=null){
            int temp=head.val;
            if(temp==0){
                cnt++;
            }
            else{
                sum+=temp;
            }
            if(cnt==2){
                newList.next = new ListNode(sum);
                cnt=1;
                sum=0;
                newList = newList.next;
            }
            head = head.next;


        }
        return dummy.next;
        
    }
}