class Solution {
    public String capitalizeTitle(String title) {
        String[] words=title.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String s: words){
            if(s.length()<3){
                sb.append(s.toLowerCase()+" ");
            }else{
                StringBuilder tmp=new StringBuilder(s.toLowerCase());
                tmp.setCharAt(0, Character.toUpperCase(tmp.charAt(0)));
                sb.append(tmp+" ");
            }
        }
        return sb.toString().trim();
    }
}
