public class Subarray3loops {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,1,9,-5,8,7,6};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println("Maximum sum of subarray is: " + max);
    }
}
