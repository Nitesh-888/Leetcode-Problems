package Problems;

public class L88 {
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n; i++){
            int curr=nums2[i];
            int j=m-1+i;
            while( j>=0 && (nums1[j] > curr)){
                nums1[j+1]=nums1[j];
                j--;
            }
            nums1[j+1]=curr;
        }
    }
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1, j=n-1;
        int idx=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[idx]=nums1[i];
                i--;
                idx--;
            }else{
                nums1[idx]=nums2[j];
                j--;
                idx--;
            }
    
        }
        while(j>=0){
            nums1[idx]=nums2[j];
            idx--;
            j--;
        }
    }
    public static void printArray(int [] n){
        for(int i=0; i<n.length; i++){
            System.out.print(n[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] num1={1,2,3,0,0,0};
        int [] num2 = {2,5,6};
        int m=3, n=3;
        // merge1(num1, m, num2, n);
        merge2(num1, m, num2, n);
        printArray(num1);
    }
}
