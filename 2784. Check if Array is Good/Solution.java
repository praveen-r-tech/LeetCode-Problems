class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n+1];
        for(int val: nums){
            if(val<1 || val>n-1) return false;
            arr[val]++;
        }
        if(arr[n-1]!=2) return false;
        for(int i=1; i<n-1; i++){
            if(arr[i]!=1) return false;
        }
        return true;
    }
}
