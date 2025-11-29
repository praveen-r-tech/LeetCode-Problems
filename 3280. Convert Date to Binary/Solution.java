class Solution {
    public String convertDateToBinary(String date) {
      String[] d=date.split("-");
      StringBuilder sb=new StringBuilder();
      for(int i=0; i<d.length; i++){
          int val=Integer.parseInt(d[i]);
          sb.append(Integer.toBinaryString(val));
          if(i!=d.length-1) sb.append("-");
      }
      return sb.toString();
    }
}
