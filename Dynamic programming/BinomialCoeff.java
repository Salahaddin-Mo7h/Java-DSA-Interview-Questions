/*
  Binomial Coefficient
    Calculating the binomial coefficient nCk with help of dynamic programming technique.
    Type of algorithm used: Dynamic Programming.
 */

import java.util.Scanner;

public class  BinomialCoeff {
    static int calcuate(int n,int k){
        int[][] solutions=new int[n+1][k+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=k;j++){
                if(j==i || j==0)
                    solutions[i][j]=1;
                else if(i>j)
                    solutions[i][j]=solutions[i-1][j-1]+solutions[i-1][j];
            }
        }
        return solutions[n][k];
    }
    public static void main(String[] args) {
        int n,k;
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n=reader.nextInt();
        System.out.print("Enter the value of k: ");
        k=reader.nextInt();
        System.out.println("The ans of nCk is "+calcuate(n, k));
        reader.close();
    }
}
