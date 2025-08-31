class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String norm= paragraph.replaceAll("[^a-zA-Z]"," ").toLowerCase();
        String[] word= norm.split("\\s+");
        List<String> ban=new ArrayList<>();
        for(String w: banned){
            ban.add(w);
        }
        Map<String, Integer> hm=new HashMap<>();
        for(String w: word){
            if(!ban.contains(w)){
                hm.put(w, hm.getOrDefault(w, 0)+1);
            }
        }
        return Collections.max(hm.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
