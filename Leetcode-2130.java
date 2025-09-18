import java.util.Stack;
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public int pairSum(ListNode head) {
        Stack<Integer> s=new Stack<>();
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        while(slow!=null){
            s.push(slow.val);
            slow=slow.next;
        }
        ListNode curr=head;
        int ans=0;
        while(!s.isEmpty()){
            ans=Math.max(curr.val+s.pop(), ans);
            curr=curr.next;
        }
        return ans;
    }
    public int pairSum2(ListNode head) {
        Stack<Integer> s=new Stack<>();
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            s.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        int ans=0;
        while(!s.isEmpty()){
            ans=Math.max(slow.val+s.pop(), ans);
            slow=slow.next;
        }
        return ans;
    }
}