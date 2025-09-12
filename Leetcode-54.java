package Problems;

import java.util.ArrayList;
import java.util.List;

public class L54 {
    public static List<Integer> Spiral(int n[][]){
        List<Integer> ans=new ArrayList<>();
        int fr=0, lr=n.length-1;
        int fc=0, lc=n[0].length-1;
        while(lr >= fr && lc >= fc){
            //top
            for(int i=fc; i<=lc; i++){
                ans.add(n[fr][i]);
            }
            fr++;
            
            //right
            if(lr >= fr && lc >= fc){
                for(int i=fr; i<=lr; i++){
                    ans.add(n[i][lc]);
                }
                lc--;
            }

            //bottom
            if(lr >= fr && lc >= fc){
                for(int i=lc; i>=fc; i--){
                    ans.add(n[lr][i]);
                }
                lr--;
            }

            //left
            if(lr >= fr && lc >= fc){
                for(int i=lr; i>=fr; i--){
                    ans.add(n[i][fc]);
                }
                fc++;
            }
        }
        return ans;
    }
    public static void printArray(List<Integer> n){
        for(int i=0; i<n.size(); i++){
            System.out.print(n.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] n={{1,2,3}, {4,5,6}, {7,8,9}};
        printArray(Spiral(n));

        
    }
}
