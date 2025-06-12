class Solution {
    public String reverseStr(String s, int k) {
      char[] arr= s.toCharArray();
      for(int idx=0; idx<arr.length; idx+=2*k){
        int i= idx, j= Math.min(idx + k-1, arr.length-1);
        while(i<j){
            char tmp= arr[i];
            arr[i++]= arr[j];
            arr[j--]= tmp;
        }
      }
      return new String(arr);
    }
}
