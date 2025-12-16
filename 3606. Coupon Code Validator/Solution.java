class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
      HashSet<String> type=new HashSet<>();
      type.add("electronics");
      type.add("grocery");
      type.add("pharmacy");
      type.add("restaurant");
      List<String[]> ans=new ArrayList<>();
      for(int i=0; i<isActive.length; i++){
        if(!isActive[i]) continue;
        if(!type.contains(businessLine[i])) continue;
        if(code[i].isEmpty()) continue;
        String s=code[i];
        boolean flag=true;
        for(char ch: s.toCharArray()){
            if(!(Character.isLetterOrDigit(ch) || ch=='_')){
               flag=false;
               break;
            }
        }
        if(flag) ans.add(new String[]{businessLine[i], s});
      } 
      Collections.sort(ans, (a, b) -> {
            String[] order = {"electronics", "grocery", "pharmacy", "restaurant"};
            int p1 = Arrays.asList(order).indexOf(a[0]);
            int p2 = Arrays.asList(order).indexOf(b[0]);
            if (p1 != p2) return p1 - p2;
            return a[1].compareTo(b[1]);
      });
      List<String> res=new ArrayList<>();
      for(String[] arr: ans) {
          res.add(arr[1]);
      }
      return res;
    }
}
