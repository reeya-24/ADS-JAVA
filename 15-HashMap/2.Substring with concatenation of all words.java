//leetcode 30
class Solution {
    HashMap<String,Integer> h = new HashMap<>();
    int wordsLen;
    int wordLen;
    int k;
    public boolean check(int idx, String s){
        HashMap<String,Integer> h1 = new HashMap<>(h);
        int c=0;
        for(int i=idx; i<idx+k; i+=wordLen){
            String str = s.substring(i,i+wordLen);
            if(h1.containsKey(str)){
                if(h1.get(str)>0){
                    c++;
                    h1.put(str,h1.get(str)-1);
                    if(c==wordsLen)
                        return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return false;
    }
    public List<Integer> findSubstring(String s, String[] words) {
        
        for(int i=0; i<words.length; i++){
            h.put(words[i],h.getOrDefault(words[i],0)+1);
        }
        wordsLen=words.length;
        wordLen=words[0].length();
        k=wordsLen*wordLen;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<s.length()-k+1; i++){
            if(check(i,s)){
                arr.add(i);
            }
        }
        return arr;
    }
}
