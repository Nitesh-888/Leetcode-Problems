class L1910 {
    public static int findOccurrence(StringBuilder s, String part){
        int partIdx=0;
        for(int i=0; i<s.length(); i++){
            if(part.charAt(partIdx)==s.charAt(i)){
                partIdx++;
            }else{
                if(partIdx!=0){
                    i-=partIdx;
                    partIdx=0;
                }
            }
            if(partIdx==part.length()){
                return i-partIdx+1;
            }
        }
        return -1;
    }
    public static String removeOccurrences(String s, String part) {
        StringBuilder str=new StringBuilder(s);
        int idx=findOccurrence(str, part);
        while(idx!=-1){
            str.delete(idx, idx+part.length());
            idx=findOccurrence(str, part);
        }
        return str.toString();
    }
    public static String removeOccurrences2(String s, String part) {
        // Keep removing the leftmost occurrence of 'part' from 's' until none exist
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }
    
    public static void main(String[] args) {
        String s="daabcbaabcbc";
        String part="abc";
        System.out.println(removeOccurrences(s, part));
        
    }
}
