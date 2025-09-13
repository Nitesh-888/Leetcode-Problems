class L125 {
    public static boolean isPalindrome(String s) {
        StringBuilder ans=new StringBuilder();
        s=s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                ans.append(s.charAt(i));

            }
        }
        System.out.println(ans);
        int st=0, end=ans.length()-1;
        while(st<=end){
            if(ans.charAt(st) != ans.charAt(end)){
                return false;
            }
            st++; 
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="0P";
        System.out.println(isPalindrome(s));
    }
}
