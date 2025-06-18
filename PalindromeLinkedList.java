class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode revsec=reverse(slow);
        fast=head;
        while(revsec!=null){
            if(fast.val!=revsec.val){
                return false;
            }
            fast=fast.next;
            revsec=revsec.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
}
