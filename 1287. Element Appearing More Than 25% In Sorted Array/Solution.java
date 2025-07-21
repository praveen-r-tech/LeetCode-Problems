class Solution {
    public int findSpecialInteger(int[] arr) {
      Map<Integer, Integer> hm= new HashMap<>();
      for(int val: arr){
        hm.put(val, hm.getOrDefault(val, 0)+1);
      }
      for(int val: hm.keySet()){
        if(hm.get(val)>arr.length/4){
            return val;
        }
      }
      return -1;
    }
}
