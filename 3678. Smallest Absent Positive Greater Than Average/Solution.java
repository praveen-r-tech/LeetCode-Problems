class Solution {
    public int smallestAbsent(int[] nums) {
      double sum=0;
      for(int val: nums){
        sum+=val;
      }
      double avg=sum/nums.length;
      int ct=1;
      while(true){
            if(ct>avg){
               boolean flag=false;
               for(int val: nums){
                   if(val==ct){
                      flag=true;
                      break;
                   }
               }
               if(!flag) return ct;
            }
            ct++;
      }
    }
}
