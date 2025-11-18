class Solution {
    public int numSub(String s) {
        long count=0;                
        long mod=1000000007;        
        long n=0;                          
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
               n++;                         
            }else{
               count+=n*(n+1)/2;  
               n=0;
            }
        }
        count+=n*(n+1)/2;            
        return (int)(count%mod);
    }
}
