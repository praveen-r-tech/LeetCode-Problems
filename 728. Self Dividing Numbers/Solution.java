class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ls=new ArrayList<>();
        for(int i=left; i<=right; i++){
            int count=0;
            String s=String.valueOf(i);
            if(s.indexOf('0')>-1) continue;
            for(char c: s.toCharArray()){
                if(i%(c-'0')==0) count++;
            }
            if(s.length()==count) ls.add(i);
        }
        return ls;
    }
}
