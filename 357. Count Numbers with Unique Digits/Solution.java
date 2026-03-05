class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int ttl=10;
        int unq=9; 
        int able=9;
        for(int i=2; i<=n && able>0; i++) {
            unq*=able;
            ttl+=unq;
            able--;
        }
        return ttl;
    }
}
