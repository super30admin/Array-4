class Solution {// time of O(n) and space constant
    public ListNode rotateRight(ListNode head, int k) {
        //base case 
        if(head == null)
            return null;
        if(head.next == null){
            return head;
        }    
        int count = 1;
        ListNode oldhead = head;
        ListNode newhead = null;
        while(head.next != null){
            head = head.next;
            count++;
        }
        head.next = oldhead;
        k = k%count ;
        while(oldhead.next !=null && count-k-1>0){
            oldhead = oldhead.next;
            k++;
        }
        newhead = oldhead.next;
        oldhead.next = null;
        return newhead;
    }
}