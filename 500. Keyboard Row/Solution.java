class Solution {

    boolean isPresent(String w, String r){
        for(char ch: w.toCharArray()){
            if(r.indexOf(ch)<0) return false;
        }
        return true;
    }

    public String[] findWords(String[] words) {
      String[] rows={"qwertyuiop", "asdfghjkl", "zxcvbnm"}; 
      List<String> res=new ArrayList<>();
      for(String w: words){
        for(String r: rows){
            if(isPresent(w.toLowerCase(),r)) res.add(w);
        }
      }
      int idx=0;
      String[] ans=new String[res.size()];
      for(String s: res){
          ans[idx++]=s;
      }
      return ans;
    }
}
