package Problems;

import java.util.Scanner;

public class L50 {
    public static double pow1(double x, int n) {
        double ans=1;
        if(n<0){
            x=1/x;
            n=-n;
        }
        for(int i=0; i<n; i++){
            ans*=x;
        }
        return ans;
    }

    // more optimise approach using Binary exponentiation
    public static double pow2(double x, int n){
        double ans=1;
        long exp=n;
        if(exp<0){
            x=1/x;
            exp=-exp;
        }
        while(exp>0){
            if(exp%2==1){
                ans*=x;
            }
            x*=x;
            exp/=2;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.print("Enter the base : ");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        System.out.print("Enter the exponenet : ");
        int n=sc.nextInt();
        sc.close();

        System.out.println(pow1(x, n));
        System.out.println(pow2(x, n));
    }
}
