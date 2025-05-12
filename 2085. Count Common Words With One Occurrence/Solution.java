class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count= 0;
        HashMap<String, Integer> hm1= new HashMap<>();
        HashMap<String, Integer> hm2= new HashMap<>();
        for(String str: words1){
           hm1.put(str, hm1.getOrDefault(str, 0)+1);
        }
        for(String str: words2){
           hm2.put(str, hm2.getOrDefault(str, 0)+1);
        }
        for(String key: hm1.keySet()){
            if(hm2.containsKey(key)){
               if(hm1.get(key)==1 && hm2.get(key)==1)count++;
            }
        }
        return count;
    }
}
