import java.util.HashSet;
import java.util.Arrays;
class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        if(n1!=n2) return false;
        HashSet<Character> hs1=new HashSet<>();
        HashSet<Character> hs2=new HashSet<>();
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0; i<n1; i++){
            hs1.add(word1.charAt(i));
            freq1[word1.charAt(i)-'a']++;
        }
        for(int i=0; i<n2; i++){
            hs2.add(word2.charAt(i));
            freq2[word2.charAt(i)-'a']++;
        }
        if(hs1.size()!=hs2.size()) return false;
        for(char ch : hs1){
            if(!hs2.contains(ch)) return false;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }
    //more optimized
    public boolean closeStrings1(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        if(n1!=n2) return false;

        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(char c : word1.toCharArray()) freq1[c-'a']++;
        for(char c : word2.toCharArray()) freq2[c-'a']++;

        for(int i=0; i<26; i++){
            if((freq1[i]==0 && freq2[i]!=0) || freq2[i]==0 && freq1[i]!=0) return false;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }
}