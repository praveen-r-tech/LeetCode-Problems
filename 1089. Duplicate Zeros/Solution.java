class Solution {
    public void duplicateZeros(int[] arr) {
      int n=arr.length;
      int idx=0;
      int[] tmp=new int[n];
      for(int i=0; i<n && idx<n; i++){
        if(arr[i]!=0){
            tmp[idx++]=arr[i];
        }else{
            idx++;
            if(idx<n) idx++;
        }
      }  
      for(int i=0; i<n; i++){
        arr[i]=tmp[i];
      }
    }
}
