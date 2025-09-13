class L74 {
    public static boolean Search(int[][] n, int target) {
        int rows=n.length;
        int col=n[0].length;
        int st=0, end=rows-1, mid=0;
        while(st<=end){
            mid=st+(end-st)/2;
            if(n[mid][0] <= target && target <= n[mid][col-1]){
                break;
            } else if(target < n[mid][col-1]) {
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        st=0;
        end=col-1;
        while(st<=end){
            int nmid=st+(end-st)/2;
            if(n[mid][nmid] == target){
                return true;
            }else if(n[mid][nmid] < target){
                st=nmid+1;
            }else{
                end=nmid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] n={{1,3,5,7},{10,11,16,20}};
        System.out.println(Search(n, 33));
    }
}
