class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++){
            int val=Math.abs(arr[i-1]-arr[i]);
            if(val<min) min=val;
        }
        for(int i=1; i<arr.length; i++){
            int tmp=Math.abs(arr[i-1]-arr[i]);
            if(tmp==min) ans.add(new ArrayList<>(List.of(arr[i-1],arr[i])));
        }
        return ans;
    }
}
