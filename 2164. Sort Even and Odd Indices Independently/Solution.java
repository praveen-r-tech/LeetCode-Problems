class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> e=new ArrayList<>();
        for(int i=0; i<nums.length; i+=2) e.add(nums[i]);
        Collections.sort(e);
        
        List<Integer> o=new ArrayList<>();
        for(int i=1; i<nums.length; i+=2) o.add(nums[i]);
        Collections.sort(o);

        int ei=0, oi=o.size()-1; 
        for(int i=0; i<nums.length; i++){
            if(i%2==0) nums[i]=e.get(ei++);
            else nums[i]=o.get(oi--);
        }       
        return nums;
    }
}
