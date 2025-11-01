class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head==null) return null;
        
        Set<Integer> set=new HashSet<>(nums.length*2);
        for(int num: nums) set.add(num);
        
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;

        while(curr!=null){
            if(set.contains(curr.val)){
               prev.next=curr.next;
            }else{
               prev=curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
