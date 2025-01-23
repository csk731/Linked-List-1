// TC: O(N)
// SC: O(N)

import java.util.ArrayList;

public class LC19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        int size = 0 ;
        while(temp!=null){
            list.add(temp);
            temp=temp.next;
            size++;
        }
        if(n==size) return head.next;
        list.get(size-n-1).next = list.get(size-n-1).next.next;
        return head;
    }
}
