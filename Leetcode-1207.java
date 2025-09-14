import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm=new HashMap<>();

        for(int i : arr){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i : hm.keySet()){
            int freq=hm.get(i);
            if(hs.contains(freq)) return false;
            hs.add(freq);
        }
        return true;
    }
}