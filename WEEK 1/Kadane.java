 import java.util.*;
    public class Kadane {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
    }
}

