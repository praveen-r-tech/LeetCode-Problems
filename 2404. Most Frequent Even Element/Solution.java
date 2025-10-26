class Solution {
    public int mostFrequentEven(int[] nums) {
       HashMap<Integer, Integer> hm=new HashMap<>();
       for(int num: nums){
           if(num%2==0) hm.put(num, hm.getOrDefault(num, 0)+1);
       }

       if(hm.isEmpty()) return -1;
       
       int freq=-1;
       int count=0;
       for(Map.Entry<Integer, Integer> e: hm.entrySet()){
           if(e.getValue()>count || (e.getValue()==count && e.getKey()<freq)){
              count=e.getValue();
              freq=e.getKey();
           }
       } 
       return freq;
    }
}
