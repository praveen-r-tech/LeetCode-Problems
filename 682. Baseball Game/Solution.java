class Solution {
    public int calPoints(String[] operations) {
        int sum= 0;
        List<Integer> ls= new ArrayList<>();
        for(int i=0; i<operations.length; i++){
            String op= operations[i];
            if(op.equals("C")){
               ls.remove(ls.size()-1);
            }else if(op.equals("D")){
               ls.add(ls.get(ls.size()-1)*2);
            }else if(op.equals("+")){
               ls.add(ls.get(ls.size()-1)+ls.get(ls.size()-2));
            }else{
                ls.add(Integer.parseInt(op));
            }
        }
        for(int val: ls){
            sum+= val;
        }
        return sum;
    }
}
