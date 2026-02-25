class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int val: nums){
            if(val<10) sum1+=val;
            else sum2+=val;
        }
        return sum1!=sum2;
    }
}
