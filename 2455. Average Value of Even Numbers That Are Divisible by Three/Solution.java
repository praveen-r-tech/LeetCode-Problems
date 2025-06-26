class Solution {
    public int averageValue(int[] nums) {
     int sum= 0,count= 0;
     for(int num: nums){
        if(num%6 == 0){
           sum+= num;
           count++;
        }
     }
     if(count == 0) return sum;
     else return sum/count;
    }
}
