class Solution {
    public int maxSubArray(int[] nums) {
       int max= nums[0];
       int sum= max<0 ? 0: max;
       for(int i=1; i<nums.length; i++){
        sum+= nums[i];
        max= Math.max(max, sum);
        if(sum<0){
            sum=0;
        }
       } 
       return max;
    }
}
