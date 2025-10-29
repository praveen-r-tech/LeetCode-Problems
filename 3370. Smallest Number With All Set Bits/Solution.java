class Solution {
    public int smallestNumber(int n) {
        if(n<=1) return 1;
        for(int i=2; ; i++){
            if((1<<i)-1>=n) return (1<<i)-1;
        }
    }
}
