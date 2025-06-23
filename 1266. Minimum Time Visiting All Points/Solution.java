class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
      int ans= 0;
      for(int i=0; i<points.length-1; i++){
        int cx= points[i][0];
        int cy= points[i][1];
        int tx= points[i+1][0];
        int ty= points[i+1][1];
        ans+= Math.max(Math.abs(tx-cx),Math.abs(ty-cy));
      }
      return ans;
    }
}
