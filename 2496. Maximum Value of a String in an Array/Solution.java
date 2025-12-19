class Solution {
    public int maximumValue(String[] strs) {
       int max=0;
       int val;
       for(String s: strs){
           if(s.matches("\\d+")) val=Integer.parseInt(s);
           else val=s.length();
           if(val>max) max=val;
       }   
       return max;
    }
}
