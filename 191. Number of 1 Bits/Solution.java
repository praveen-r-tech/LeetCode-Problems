class Solution {
    public int hammingWeight(int n) {
        int cnt=0;
        String bit= Integer.toBinaryString(n);
        for(char ch: bit.toCharArray()){
            if(ch== '1')cnt++;
        }
        return cnt;
    }
}
