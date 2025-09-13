class L1 {
    //brute force
    public static int[] pairSum1(int n[], int target){
        int[] ans=new int[2];
        for(int i=0; i<n.length; i++){
            boolean isFound=false;
            for(int j=i+1; j<n.length; j++){
                if(n[i]+n[j]==target){
                    isFound=true;
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
            if(isFound){
                break;
            }
        }
        return ans;
    }
    //two pointer approach
    public static int[] pairSum2(int n[], int target){
        int i=0;
        int j=n.length-1;
        int[] ans=new int[2];
        while(i<j){
            int sum=n[i]+n[j];
            if(sum>target){
                j--;
            }else if(sum<target){
                i++;
            }else{
                ans[0]=i;
                ans[1]=j;
                break;
            }

        }
        return ans;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int[] n={3,2,4};
        int[] f1=pairSum1(n, 6);
        int [] f2=pairSum2(n, 6);
        printArray(f1);
        printArray(f2);
    }
}

