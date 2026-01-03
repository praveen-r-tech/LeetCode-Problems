class Solution {
    public int[] numberGame(int[] nums) {
       PriorityQueue<Integer> minhp=new PriorityQueue<>();
       int n=nums.length, j=0;
       int[] ans=new int[n];
       for(int val: nums) minhp.add(val); 
       for(int i=0; i<n/2; i++){
           int tmp=minhp.poll();
           ans[j++]=minhp.poll();
           ans[j++]=tmp;
       } 
       return ans;
    }
}
