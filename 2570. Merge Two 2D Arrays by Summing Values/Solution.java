class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
      Map<Integer, Integer> map= new TreeMap<>();
      for(int[] val: nums1){
        map.put(val[0], val[1]);
      }   
      for(int[] val: nums2){
        map.put(val[0], map.getOrDefault(val[0], 0)+val[1]);
      }
      List<int[]> ls= new ArrayList<>();
      for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        ls.add(new int[] {entry.getKey(), entry.getValue()});
      }
      int[][] ans= new int[ls.size()][2];
      for(int i=0; i<ls.size(); i++){
        ans[i]= ls.get(i);
      }
      return ans;
    }
}
