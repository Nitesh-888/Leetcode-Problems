package Problems;

import java.util.Arrays;

public class L567 {
    public static boolean checkInclusion(String s1, String s2){
        //Sliding window approach
        int n1=s1.length();
        int n2=s2.length();
        int[] freq=new int[26];
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i)-97]++;
        }
        for(int i=0; i<n2-(n1-1); i++){
            int[] windFreq=new int[26];
            for(int j=i; j<s1.length()+i; j++){
                windFreq[s2.charAt(j)-97]++;
            }
            if(Arrays.equals(freq, windFreq)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s2="adifavaddf";
        String s1="dav";
        System.out.println(checkInclusion(s1, s2));
    }
}
