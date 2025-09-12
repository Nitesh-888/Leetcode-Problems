package Problems;

public class L443 {
    public static int compress(char[] chars){
        //corner case
        if(chars.length==1) return 1;
        int idx=0;
        char curr=chars[0];
        int count=1;
        for(int i=1; i<chars.length; i++){
            if(chars[i]==curr){
                count++;
                if(i==chars.length-1){
                    chars[idx++]=curr;
                    for(char c : Integer.toString(count).toCharArray()){
                        chars[idx++]=c;
                    }
                }
            }else{
                chars[idx++]=curr;
                if(count!=1){
                    for(char c : Integer.toString(count).toCharArray()){
                        chars[idx++]=c;
                    }
                }
                curr=chars[i];
                count=1;
                if(i==chars.length-1){
                    chars[idx++]=curr;
                }
                
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
