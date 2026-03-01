class Solution {
    public String reverseByType(String s) {
        char[] arr=s.toCharArray();
        int lft=0;
        int rht=arr.length-1;
        while(lft<rht){
            if(Character.isLetter(arr[lft]) && Character.isLetter(arr[rht])){
                char tmp=arr[lft];
                arr[lft]=arr[rht];
                arr[rht]=tmp;
                lft++;
                rht--;
            }
            if(!Character.isLetter(arr[lft])) lft++;
            if(!Character.isLetter(arr[rht])) rht--;
        }
        lft=0;
        rht=arr.length-1;
        while(lft<rht){
            if(!Character.isLetter(arr[lft]) && !Character.isLetter(arr[rht])){
                char tmp=arr[lft];
                arr[lft]=arr[rht];
                arr[rht]=tmp;
                lft++;
                rht--;
            }
            if(Character.isLetter(arr[lft])) lft++;
            if(Character.isLetter(arr[rht])) rht--;
        }
        return new String(arr);
    }
}
