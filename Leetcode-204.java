package Problems;

import java.util.Arrays;

public class L204 {
    public static int countPrime(int n) {
        //corner case
        if(n<=2) return 0;
        int count=0;
        boolean[] isPrime=new boolean[n];
        Arrays.fill(isPrime, 2, n, true);
        for(int i=0; i<n; i++){
            if(isPrime[i]){
                count++;
                for(int j=2*i; j<n; j+=i){
                    isPrime[j]=false;
                }
            }
        }

        return count;

    }
    public static void main(String[] args) {
        System.out.println(countPrime(10));
        
    }
}