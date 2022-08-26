/*
 * KnapScak Problem --- brute froce technique.
 */

import java.util.Scanner;

public class KnapSack {
    public static void main(String[] args) {
        Scanner reader =  new Scanner(System.in);
        int[] weight=new int[10];
        int[] value=new int[10];
        int capcity,n;
        System.out.print("Enter the number of products: ");
        n=reader.nextInt();
        System.out.print("Enter the weights of the products: ");
        for(int i=0;i<n;i++)
            weight[i]=reader.nextInt();
        System.out.print("Enter the values of the product: ");
        for(int i=0;i<n;i++)
            value[i]=reader.nextInt();
        System.out.print("Enter the capacity of the knapsack: ");
        capcity=reader.nextInt();
        int solution=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=weight[i];
            int sol=value[i];
            for(int j=i+1;j<n;j++){
                if(sum+weight[j]<=capcity){
                    sum+=weight[j];
                    sol+=value[j];
                }
            }
            if(sol>solution)
                solution=sol;
        }
        System.out.println("The Greatest value to fill the knapSack is : "+solution);
        reader.close();
    }
}

/*
 * Time complexity : O(n^2)
 */