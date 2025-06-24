class Solution {
    public int countBalls(int lowLimit, int highLimit) {
       Map<Integer, Integer> bc= new HashMap<>();
       int ball= 0;
       for(int i=lowLimit; i<=highLimit; i++){
        int sum= 0, num= i;
        while(num>0){
            sum+= num%10;
            num/= 10;
        }
        bc.put(sum, bc.getOrDefault(sum, 0) +1);
        ball= Math.max(ball, bc.get(sum));
       } 
       return ball;
    }
}
