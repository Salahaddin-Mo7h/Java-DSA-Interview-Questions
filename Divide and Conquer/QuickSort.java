/*
 * Quick Sort --- Divide and conquer
 */

import java.util.Scanner;

public class QuickSort {
    static int n;
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
    static void sort(int[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    static void printArray(int arr[]){
        System.out.println("The array after sorting is : ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] arr=new int[10];
        System.out.print("Enter the number of elements : ");
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
 * Time complexity : O(n log n)
 */