class Solution {
    public int thirdMax(int[] nums) {
       Arrays.sort(nums);
       int idx=0;
       for(int i=1; i<nums.length; i++){
        if(nums[i]!= nums[idx]){
            idx++;
            nums[idx]=nums[i];
        }
       }
       int sz= idx+1;
       if(sz>=3){
           return nums[sz-3];
       }else{
            return nums[sz-1];
       } 
    }
}
