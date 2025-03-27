class Solution {
    public int search(int[] nums, int target) {
        int left= 0;
        int right= nums.length-1;
        while(left<= right){
            int mid= (left+right)/2;
            if(nums[mid]< target){
                left++;
            }else if(nums[mid]> target){
                right--;
            }else{
                return mid;
            }
        }
        return -1;
    }
