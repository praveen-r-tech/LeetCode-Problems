class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        List<Integer> ls=new ArrayList<>(); 
        for(int i=0; i<=nums.length-k; i++){
            int[] freq=new int[51];
            for(int c=i; c<i+k; c++){
               freq[nums[c]]++;
            }
            List<int[]> st=new ArrayList<>();
            for(int val=1; val<51; val++){
                if(freq[val]>0){
                    st.add(new int[]{val, freq[val]});
                }
            }

            Collections.sort(st, (a,b) -> {
                if(b[1]==a[1]) return b[0]-a[0];
                return b[1]-a[1];
            });

            int count=0;
            int sum=0;
            for(int[] pair: st){
                if(count<x){
                   sum+=pair[0]*pair[1];
                   count++;
                }else break;
            }
            ls.add(sum);
        }
      
        int[] ans=new int[ls.size()];
        for(int i=0; i<ls.size(); i++){
            ans[i]=ls.get(i);
        } 
        return ans;
    }
}
