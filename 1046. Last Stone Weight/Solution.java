class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> maxhp=new PriorityQueue<>(Collections.reverseOrder());
       for(int val: stones){
        maxhp.add(val);
       }
       while(maxhp.size()>1){
         maxhp.add(maxhp.poll()-maxhp.poll());
       }
       return maxhp.peek();
    }
}
