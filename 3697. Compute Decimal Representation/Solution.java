class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> ls =new ArrayList<>();
        String s=n+"";
        int len=s.length()-1;
        int m=(int)Math.pow(10,len);
        for(int i=0; i<=len; i++){
            int val= (s.charAt(i)-'0')*m;
            m/=10;
            if(val!=0) ls.add(val);
        }
        int[] ans=new int[ls.size()];
        for(int i=0; i<ls.size(); i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}
