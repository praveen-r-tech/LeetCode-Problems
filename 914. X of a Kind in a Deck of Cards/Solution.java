class Solution {

    int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }

    public boolean hasGroupsSizeX(int[] deck) {
       HashMap<Integer, Integer> hm=new HashMap<>();
       for(int card: deck){
           hm.put(card, hm.getOrDefault(card, 0)+1);
       } 
       int gcd=0;
       for(int val: hm.values()){
           gcd=gcd(gcd, val);
       }
       return gcd>1;
    }
}
