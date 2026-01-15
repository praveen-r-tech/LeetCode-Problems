class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=0;
        for(int i=0; i<nums.length; i+=2){
            n+=nums[i];
        }
        int[] ans=new int[n];
        int idx=0;
        for(int i=1; i<nums.length; i+=2){
            Arrays.fill(ans, idx, idx+nums[i-1], nums[i]);
            idx+=nums[i-1];
        }
        return ans;
    }
}
