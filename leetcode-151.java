class Solution {
    public static String reverseWords(String s) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.charAt(0)==' ') {
            sb.deleteCharAt(0);
        }
        while(sb.charAt(sb.length()-1)==' ') {
            sb.deleteCharAt(sb.length()-1);
        }

        StringBuilder res=new StringBuilder();
        int lastIdx=sb.length();
        for(int i=sb.length()-1; i>=0; i--){
            char ch=sb.charAt(i);
            if(ch==' '){
                if(sb.charAt(i+1)!=' '){
                    res.append(sb.substring(i+1, lastIdx));
                    res.append(' ');
                    lastIdx=i;
                    continue;
                }
                lastIdx--;
            }
        }
        res.append(sb.substring(0, lastIdx));
        return res.toString();
    }
    public static void main(String[] args) {
        
    }
}