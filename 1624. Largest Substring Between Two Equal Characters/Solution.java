class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
       Map<Character, Integer> hm=new HashMap<>();
       int ans=-1;
       for(int i=0; i<s.length(); i++){
          if(hm.containsKey(s.charAt(i))){
              int val= i-hm.get(s.charAt(i))-1;
              if(val>ans)
                 ans=val;
          }else{
              hm.put(s.charAt(i), i);
          }
       } 
       return ans;
    }
}
