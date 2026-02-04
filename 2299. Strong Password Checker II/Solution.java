class Solution {
    public boolean strongPasswordCheckerII(String password) {
       if(password.length()<8) return false;
       boolean upper=false;
       boolean lower=false;
       boolean digit=false;
       boolean spl=false;
       String s="!@#$%^&*()-+";
       if(Character.isDigit(password.charAt(0))) digit=true;
       if(Character.isUpperCase(password.charAt(0))) upper=true;
       if(Character.isLowerCase(password.charAt(0))) lower=true;
       if(s.indexOf(password.charAt(0))>-1) spl=true;
       for(int i=1; i<password.length(); i++){
           if(password.charAt(i)==password.charAt(i-1)) return false;
           if(Character.isDigit(password.charAt(i))) digit=true;
           if(Character.isUpperCase(password.charAt(i))) upper=true;
           if(Character.isLowerCase(password.charAt(i))) lower=true;
           if(s.indexOf(password.charAt(i))>-1) spl=true;
       }
       return upper && lower && digit && spl;
    }
}
