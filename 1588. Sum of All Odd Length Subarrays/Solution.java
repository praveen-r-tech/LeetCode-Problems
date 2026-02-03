class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       int ans=0;
       for(int i=0; i<arr.length; i++){
           int count=0;
           int sum=0;
           for(int j=i; j<arr.length; j++){
               sum+=arr[j];
               count++;
               if(count%2==1) ans+=sum;
           }
       }   
       return ans;
    }
}
