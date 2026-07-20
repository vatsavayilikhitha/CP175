import java.io.*;
import java.util.*;
public class Triplet{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
         arr[i]=obj.nextInt();
        }
        Arrays.sort(arr);
        int max1=arr[n-1]*arr[n-2]*arr[n-3];
        int max2=arr[0]*arr[1]*arr[n-1];
        int ans=0;
        if(max1>max2){
            System.out.println(arr[n-1]+" "+arr[n-2]+" "+arr[n-3]);
        }
        else{
            System.out.println(arr[n-1]+" "+arr[1]+" "+arr[0]);

        }
    }
}