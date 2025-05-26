class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> mp= new HashMap<>();
        for(String str: arr){
            mp.put(str, mp.getOrDefault(str, 0)+1);
        }
        
        List<String> ls= new ArrayList<>();
        for(String str: arr){
            if(mp.get(str)== 1) ls.add(str);
        }
        
        if(ls.size()<k) return "";
        return ls.get(k-1);
    }
}
