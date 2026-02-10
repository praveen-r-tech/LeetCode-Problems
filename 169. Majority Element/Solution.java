class Solution {
    public int majorityElement(int[] nums) {
     HashMap<Integer,Integer> hm=new HashMap<>();
     for(int n:nums){
        if(hm.containsKey(n)){
            hm.put(n,hm.get(n)+1);
        }else{
            hm.put(n,1);
        }
     }   
     for(int key: hm.keySet()){
        if (hm.get(key)>nums.length/2){
            return key;
        }
     }
     return -1;
    }
}
