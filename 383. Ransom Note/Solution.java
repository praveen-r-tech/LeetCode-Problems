class Solution {
    public boolean canConstruct(String s, String m) {
       int[] arr=new int[26];
       for(int i=0; i<s.length(); i++){
         int idx=s.charAt(i)-'a';
         arr[idx]++;
       } 
       for(int i=0; i<m.length(); i++){
        int idx=m.charAt(i)-'a';
        if(arr[idx]>0) arr[idx]--;
       }
       for(int n: arr){
        if(n!=0){
            return false;
        }
       }
       return true;

    }
}
