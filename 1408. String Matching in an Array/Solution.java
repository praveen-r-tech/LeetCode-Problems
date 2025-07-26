class Solution {
    public List<String> stringMatching(String[] words) {
      List<String> ans= new ArrayList<>();
      for(String check: words){
        for(String str: words){
            if(!str.equals(check) && str.contains(check)){
               ans.add(check); 
               break;
            }
        }
      }  
      return ans;
    }
}
