public class Subarray2loops {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,1,9,-5,8,7,6};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println("Maximum sum of subarray is: " + max);
    }
}
