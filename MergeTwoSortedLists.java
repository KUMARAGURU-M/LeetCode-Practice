class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=new ListNode();
        ListNode tail=temp;
        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                temp.next=list1;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
            }
            tail=tail.next;
        }
    }
}
