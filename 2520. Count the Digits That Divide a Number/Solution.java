class Solution {
    public int countDigits(int num) {
        int count=0;
        int tmp=num;
        while(tmp>0){
            if(num%(tmp%10)==0) count++;
            tmp/=10;
        }
        return count;
    }
}
