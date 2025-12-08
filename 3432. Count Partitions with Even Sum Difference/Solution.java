class Solution {
    public int countPartitions(int[] nums) {
       int ans=0;
       int sum=0;
       int lft=0;
       for(int val: nums) sum+=val;
       for(int i=0; i<nums.length-1; i++){
           lft+=nums[i];
           int rht=sum-lft;
           int tmp=Math.abs(lft-rht);
           if(tmp%2==0) ans++;
       }
       return ans;
    }
}
