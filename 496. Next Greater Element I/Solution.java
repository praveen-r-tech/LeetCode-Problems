class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      int[] ans=new int[nums1.length];
      int idx=0;
      for(int i=0; i<nums1.length; i++){
        int val=-1;
        boolean start=false;
        for(int j=0; j<nums2.length; j++){
            if(nums1[i]==nums2[j]){
               start=true;
            }
            if(start && nums2[j]>nums1[i]){
                val=nums2[j];
                break;
            }
        }
        ans[idx++]=val;
      }  
      return ans;
    }
}
