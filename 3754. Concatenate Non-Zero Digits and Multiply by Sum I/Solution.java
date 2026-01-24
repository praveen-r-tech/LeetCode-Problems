class Solution {
    public long sumAndMultiply(int n) {
        String s=String.valueOf(n).replaceAll("0","");
        if(s.isEmpty()){
           return 0; 
        }
        long x=Long.parseLong(s);
        int sum=0;
        long tmp=x;
        while(tmp>0){
            sum+=tmp%10;
            tmp/=10;
        }
        return sum*x;
    }
}
