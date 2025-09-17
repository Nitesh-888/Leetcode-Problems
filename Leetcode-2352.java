import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        HashMap<ArrayList<Integer>, Integer> hm = new HashMap<>();
        for(int[] row : grid){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i : row){
                list.add(i);
            }
            hm.put(list, hm.getOrDefault(list, 0)+1);
        }
        int ans=0;
        for(int col=0; col<n; col++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int row=0; row<n; row++){
                list.add(grid[row][col]);
            }
            if(hm.containsKey(list)){
                ans+=hm.get(list);
            }
        }
        return ans;
    }
}