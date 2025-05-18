class Solution {
    public int findNumbers(int[] nums) {
        int ct= 0;
        for(int val: nums){
            String num= Integer.toString(val);
            if(num.length()%2==0)ct++;
        }
        return ct;
    }
}
