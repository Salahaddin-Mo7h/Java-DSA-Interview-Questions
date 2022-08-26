/*
 * Merge Sort --- Divide and conquer technique.
*/
import java.util.Scanner;

public class MergeSort{
    static int n;
    static void merge(int[] arr,int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int[] l1 = new int[n1];
        int[] l2 = new int[n2];
        for(int i=0;i<n1;i++)
            l1[i]=arr[l+i];
        for(int j=0;j<n2;j++)
            l2[j]=arr[j+m+1];
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(l1[i]<l2[j]){
                arr[k]=l1[i];
                i++;
            }
            else{
                arr[k]=l2[j];
                j++;
            }
            k++;
        }
        if(i<n1){
            while(i<n1){
                arr[k]=l1[i];
                i++;
                k++;
            }
            while(j<n2){
                arr[k]=l2[j];
                j++;
                k++;
            }
        }
    }
    static void sort(int[] arr,int l,int r){
        if(l<r){
            int m=l+(r-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    static void printArray(int[] arr){
        System.out.println("The sorted array is : ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int [] arr=new int[10];
        System.out.print("Enter the size of the size: ");
        n=reader.nextInt();
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=reader.nextInt();
        sort(arr, 0, n-1);
        printArray(arr);
        reader.close();
    }
}
/*
 * Time complexity : O(n*log n)
 */