class Solution {
    public boolean isHappy(int n) {
       Set<Integer> visited=new HashSet<>();
       while(!visited.contains(n)){
        visited.add(n);
        n=fun(n);
        if(n==1)
          return true;
       } 
       return false;
    }
    int fun(int n){
        int val=0;
        while(n>0){
            val+=(n%10)*(n%10);
            n/=10;
        }
        return val;
    }
}
