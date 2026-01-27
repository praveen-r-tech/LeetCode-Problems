class Solution {

    static int fun(int a){
        int ttl=0; 
        while(a>0){
            ttl+=a%10;
            a/=10;
        }
        return ttl;
    }

    public int countLargestGroup(int n) {
       int[] freq=new int[n+1];
       int max=0;
       for(int i=1; i<=n; i++){
           int idx=fun(i);
           freq[idx]++;
           if(freq[idx]>max) max=freq[idx];
       } 
       int ans=0;
       for(int i=1; i<=n; i++){
           if(freq[i]==max) ans++;
       }
       return ans;
    }
}
