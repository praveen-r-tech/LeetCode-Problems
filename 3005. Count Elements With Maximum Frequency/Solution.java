class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=0;
        int[] freq=new int[101];
        for(int i=0; i<nums.length; i++){
            int idx= nums[i];
            freq[idx]++;
            if(freq[idx]>max) max=freq[idx];
        }
        int total=0;
        for(int i=0; i<101; i++){
            if(freq[i]==max){
                total+=freq[i];
            }
        }
        return total;
    }
}
