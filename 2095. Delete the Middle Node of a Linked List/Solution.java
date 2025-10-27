    class Solution {
        public ListNode deleteMiddle(ListNode head) {
          if(head==null||head.next==null) return null;
          ListNode tmp=head;
          int count=0;
          while(tmp!=null){
                count++;
                tmp=tmp.next;
          } 
          int mid=count/2;
          tmp=head;
          for(int i=1; i<mid; i++){
              tmp=tmp.next;
          }
          tmp.next=tmp.next.next;
          return head;
        }
    }
