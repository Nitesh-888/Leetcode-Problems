class L852 {
    public static int peakIndexInMountainArray(int[] arr) {
        for(int i=1; i<=arr.length-2; i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                return i;
            }
        }
        return -1;
    }
    public static int peakIndexInMountainArray1(int[] arr) {
        int l=arr.length;
        int st=1;
        int end=l-2;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            }else if (arr[mid] < arr[mid+1] && arr[mid] > arr[mid-1]){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] n={3,4,5,6,2,1};
        System.out.println(peakIndexInMountainArray(n));
        System.out.println(peakIndexInMountainArray1(n));
    }
}
