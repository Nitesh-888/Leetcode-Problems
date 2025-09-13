class L11 {
    public static int maxArea1(int[] height) {
        int maxar=0;
        for(int i=0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                int l=Math.min(height[i], height[j]);
                int b=j-i;
                maxar=Math.max(maxar, l*b);
            }
        }
        return maxar;
    }
    public static int maxArea2(int[] height){
        int maxar=0;
        int st=0, end=height.length-1;
        while(st<end){
            int l=Math.min(height[st], height[end]);
            int b=end-st;
            maxar=Math.max(maxar, l*b);
            if (height[st] < height[end]){
                st++;
            } else{
                end--;
            }
        }
        return maxar;
    }
    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        int[] heights2 = {1,2,4,3,2};
        System.out.println(maxArea1(heights));
        System.out.println(maxArea2(heights));
        System.out.println(maxArea1(heights2));
        System.out.println(maxArea2(heights2));
        
    }
}
