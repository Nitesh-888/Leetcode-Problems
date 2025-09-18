class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        if(head.next == null) return head;
        ListNode firstPtr = head;
        ListNode secondPtr = head.next;
        ListNode firstPtrNext = null;
        ListNode secondPtrNext = null;
        ListNode secondPart=secondPtr;

        while(secondPtr!=null && secondPtr.next!=null){
            firstPtrNext = firstPtr.next.next;
            secondPtrNext = secondPtr.next.next;
            firstPtr.next=firstPtrNext;
            secondPtr.next=secondPtrNext;

            firstPtr=firstPtr.next;
            secondPtr=secondPtr.next;
        }
        firstPtr.next=secondPart;
        return head;
    }
}