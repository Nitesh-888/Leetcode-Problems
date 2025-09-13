class L9 {
    public static int reverse(int x) {
        int rev=0;
        while(x!=0){
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev=rev*10+x%10;
            x/=10;
        }
        return rev;
    }
    public static boolean isPalindrome(int n){
        if(n<0) return false;
        if(reverse(n)==n){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
}
