class Solution {
    public int maxProduct(int n) {
        List<Integer> ls=new ArrayList<>();
        String s=n+"";
        for(char ch: s.toCharArray()){
            ls.add(ch-'0');
        }
        Collections.sort(ls);
        int len=ls.size();
        if(len==1) return 0;
        return ls.get(len-1)*ls.get(len-2);
    }
}
