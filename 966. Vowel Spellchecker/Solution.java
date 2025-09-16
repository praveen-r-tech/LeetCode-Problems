class Solution {

    boolean isVowel(char c){
      String vow="AEIOUaeiou";
      return vow.indexOf(c)>-1;
    }

    String removeVowel(String s){
      StringBuilder sb=new StringBuilder();
      for(char c: s.toLowerCase().toCharArray()){
        if(isVowel(c)) sb.append('*');
        else sb.append(c);
      }
      return sb.toString();
    }

    public String[] spellchecker(String[] wordlist, String[] queries) {
        String[] res=new String[queries.length];
        HashSet<String> set=new HashSet<>(Arrays.asList(wordlist));
        HashMap<String, String> caseErr=new HashMap<>();
        HashMap<String, String> vowErr=new HashMap<>();
        for(String w: wordlist){
            caseErr.putIfAbsent(w.toLowerCase(), w);
            vowErr.putIfAbsent(removeVowel(w),w);
        }
        int idx=0;
        for(String q: queries){
            if(set.contains(q)) res[idx]=q;
            else if(caseErr.containsKey(q.toLowerCase())) res[idx]=caseErr.get(q.toLowerCase());
            else if(vowErr.containsKey(removeVowel(q))) res[idx]=vowErr.get(removeVowel(q));
            else res[idx]="";
            idx++;
        }
        return res;
    }
}
