import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public static String sortVowels(String s) {
        int n=s.length();
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            if(hs.contains(Character.toLowerCase(ch))){
                list.add(ch);
            }
        }
        char[] arr=new char[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i]=list.get(i);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        int idx=0;
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            if(hs.contains(Character.toLowerCase(ch))){
                sb.append(arr[idx++]);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {

    }

}