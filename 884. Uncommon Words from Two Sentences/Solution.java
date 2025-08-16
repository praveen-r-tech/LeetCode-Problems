class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
      Map<String, Integer> hm=new HashMap<>();
      for(String w: s1.split(" ")){
        hm.put(w, hm.getOrDefault(w, 0)+1);
      }  
      for(String w: s2.split(" ")){
        hm.put(w, hm.getOrDefault(w, 0)+1);
      }
      List<String> res=new ArrayList<>();
      for(Map.Entry<String, Integer> m: hm.entrySet()){
        if(m.getValue()==1){
            res.add(m.getKey());
        }
      }
      int i=0;
      String[] ans=new String[res.size()];
      for(String s: res){
        ans[i++]=s;
      }
      return ans;
    }
}
