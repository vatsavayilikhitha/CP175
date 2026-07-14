import java.util.*;
public class Median {
    public static void main(String args[]){
      Scanner obj=new Scanner(System.in);
      int n1=obj.nextInt();
      int arr1[]=new int[n1];
      for(int i=0;i<n1;i++){
        arr1[i]=obj.nextInt();
      }
      int n2=obj.nextInt();
      int arr2[]=new int[n2];
      for(int i=0;i<n2;i++){
        arr2[i]=obj.nextInt();
      }
      int n=n1+n2;
      int arr3[]=new int[n];
      int i=0, j=0, k=0;
      while(i<n1&&j<n2){
        if(arr1[i]<arr2[j]){
          arr3[k]=arr1[i];
          i++;
        }
        else{
          arr3[k]=arr2[j];
          j++;
        }
        k++;
      }
        while(i<n1){
            arr3[k]=arr1[i];
            i++;
            k++;
        }  
        while(j<n2){
                arr3[k]=arr2[j];
                j++;
                k++;
            }
    if(n%2==0){
        int mid1=arr3[n/2];
        int mid2=arr3[(n/2)-1];
        double median=(mid1+mid2)/2.0;
        System.out.println(median);
    }
    else{
        double median=arr3[n/2];
        System.out.println(median);
    }
}
}
