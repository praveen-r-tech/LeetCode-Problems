class Solution {
    public int smallestIndex(int[] nums) {
       for(int i=0; i<nums.length; i++){
           String s=nums[i]+"";
           int sum=0;
           for(char ch: s.toCharArray()){
               sum+=ch-'0';
            }
            if(sum==i) return i;
       } 
       return -1;
    }
}
