class Solution {
    public int earliestTime(int[][] tasks) {
       int min=Integer.MAX_VALUE;
       for(int num[]: tasks){
           int val=num[0]+num[1];
           if(val<min) min=val;
       } 
       return min;
    }
}
