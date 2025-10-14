class Solution {
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int st=0, end=k-1;
        int count=0;
        for(int i=st; i<=end; i++){
            char ch = s.charAt(i);
            if(isVowel(ch)) count++;
        }

        st++;
        end++;
        int maxV=count;
        while(end<s.length()){
            if(isVowel(s.charAt(st-1))) count--;
            if(isVowel(s.charAt(end))) count++;

            maxV = Math.max(maxV, count);
            st++;
            end++;
        }
        return maxV;
    }
}