public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headB!=null){
            ListNode startA=headA;
            while(startA!=null){
                if(startA==headB) return headB;
                startA=startA.next;
            }
            headB=headB.next;
        }
        return null;
    }
}
