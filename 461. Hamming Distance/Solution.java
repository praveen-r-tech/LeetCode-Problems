class Solution {
    public int hammingDistance(int x, int y) {
        String s1=Integer.toBinaryString(x);
        String s2=Integer.toBinaryString(y);
        int n= Math.max(s1.length(), s2.length());
        while(s1.length()<n) s1="0"+s1;
        while(s2.length()<n) s2="0"+s2;
        int count=0;
        for(int i=0; i<n; i++){
            if(s1.charAt(i)!=s2.charAt(i)) count++;
        }
        return count;
    }
}
