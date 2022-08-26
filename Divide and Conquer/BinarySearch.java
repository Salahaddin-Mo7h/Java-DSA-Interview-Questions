/*
 * Binary search --- Divide and conquer technique.
 */

import java.util.Scanner;

public class BinarySearch{
    static int arr[],n;
    static int binary(int ele){
        int beg,end,mid;
        beg=0;
        end=n-1;
        while(beg<=end){
            mid=(beg+end)/2;
            if(arr[mid]==ele)
                return mid;
            else if(arr[mid]>ele)
                end=mid-1;
            else
                beg=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        arr=new int[10];
        int element;
        System.out.print("Enter the number of the elements in the array: ");
        n=reader.nextInt();
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=reader.nextInt();
        System.out.print("Enter the element to be searched: ");
        element=reader.nextInt();
        int x=binary(element);
        if(x==-1)
            System.out.print("No such element in the array");
        else
            System.out.print("Element found in the array");
        reader.close();
    }
}

/*
 * Time complexity : O(log n)
 */