class Solution {
    public int minMoves(int[] nums) {
       int max=0;
       for(int val: nums)
           if(val>max) max=val;
        int sum=0;
        for(int val: nums){
            sum+=max-val;
        }
        return sum;
    }
}
