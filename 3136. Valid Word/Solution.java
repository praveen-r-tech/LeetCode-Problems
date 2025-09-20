class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        word = word.toLowerCase();
        boolean hasVowel = false, hasConsonant = false;
        for(char ch : word.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                hasVowel = true;
            else if(!Character.isLetterOrDigit(ch))
                return false;
            else if(Character.isLetter(ch))
                hasConsonant = true;
        }
        return hasVowel && hasConsonant;
    }
}
