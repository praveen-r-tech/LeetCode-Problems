class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum=0;
        int prev=0;
        for(int i=1; i<colors.length(); i++){
            if(colors.charAt(prev)==colors.charAt(i)){
               sum+=Math.min(neededTime[prev],neededTime[i]);
               if(neededTime[prev]<neededTime[i]) prev=i;
            }else{
                prev=i;
            }
        }
        return sum;
    }
}
