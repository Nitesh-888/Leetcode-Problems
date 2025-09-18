
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        int n=0;
        ListNode curr=head;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        int mid=n/2;
        curr=head;
        ListNode prev=null;
        for(int i=1; i<=mid; i++){
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
        return head;
    }
}