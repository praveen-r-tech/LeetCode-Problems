class Solution {
    public int minPairSum(int[] nums) {
       Arrays.sort(nums);
       int max=0;
       int lft=0;
       int rht=nums.length-1;
       while(lft<rht){
        int sum=nums[lft]+nums[rht];
        if(sum>max) max=sum;
        lft++;
        rht--;
       }  
       return max; 
    }
}
