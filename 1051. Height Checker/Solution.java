class Solution {
    public int heightChecker(int[] heights) {
      int[] expect= Arrays.copyOf(heights, heights.length);
      Arrays.sort(expect);
      int idx= 0;
      int count= 0;
      for(int val: heights){
        if(val!= expect[idx]){
            count++;
        }
        idx++;
      }
      return count;
    }
}
