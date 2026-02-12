class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length<3) return false;
        boolean p=false;
        boolean q=false;
        if(nums[1]<=nums[0]) return false;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==nums[i]) return false;
            if(nums[i-1]>nums[i] && !p && !q) p=true;
            if(nums[i-1]<nums[i] && p) q=true;
            if(nums[i-1]>nums[i] && q) return false;
        }
        return p && q;
    }
}
