class Solution {
    public int[] diStringMatch(String s) {
       int l= s.length();
       int n= 0, m= l;
       int[] ans= new int[l+1];
       for(int i=0; i<l; i++){
        if(s.charAt(i) == 'I') ans[i]= n++;
        else ans[i]= m--;
       }
       ans[l]= n;
       return ans;
    }
}
