class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        List<Integer> ls=new ArrayList<>();
        for(int n: nums) if(!ls.contains(n)) ls.add(n);
        Collections.sort(ls);
        Collections.reverse(ls);
        if(ls.size()<k){
            int[] ans=new int[ls.size()];
            for(int i=0; i<ls.size(); i++) ans[i]=ls.get(i);
            return ans;
        }
        int[] ans=new int[k];
        for(int i=0; i<k; i++) ans[i]=ls.get(i);
        return ans;
    }
}
