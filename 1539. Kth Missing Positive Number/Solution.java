class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i=0; i<arr.length; i++){
            int tmp=arr[i]-(i+1);
            if(tmp>=k) return i+k;
        }
        return k+arr.length;
    }
}
