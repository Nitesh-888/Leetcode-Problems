class Leetcode443 {
    public static int compress(char[] chars) {
        int n=chars.length;
        char prev=chars[0];
        int count=1;
        int idx=0;
        for(int i=1; i<n; i++){
            char curr=chars[i];
            if(curr==prev){
                count++;
            }else{
                chars[idx++]=prev;
                if(count!=1) {
                    if(count<=9){ 
                        chars[idx++]=(char)(count+'0');
                    }else{
                        String cnt=String.valueOf(count);
                        for(char ch : cnt.toCharArray()){
                            chars[idx++]=ch;
                        }
                    }
                }
                count=1;
            }
            prev=curr;
        }
        chars[idx++]=prev;
        if(count==1) return idx;
        
        if(count<=9){ 
            chars[idx++]=(char)(count+'0');
        }else{
            String cnt=String.valueOf(count);
            for(char ch : cnt.toCharArray()){
                chars[idx++]=ch;
            }
        }
        return idx;
    }
    public static void printArray(char [] n){
        for(int i=0; i<n.length; i++){
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char[] chars={'a','a','a','b','b','b','d','d','d','e'};
        char[] chars2={'a'};
        System.out.println(compress(chars2));
        printArray(chars2);
        System.out.println(compress(chars));
        printArray(chars);


        
    }
}
