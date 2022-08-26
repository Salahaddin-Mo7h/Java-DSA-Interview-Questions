/*
 * Computing power(a,n) --- technique used brute force.
 */
import java.util.Scanner;

public class Power{
    static int compute(int a,int n){
        int mul=1;
        for(int i=0;i<n;i++)
            mul*=a;
        return mul;
    }
    public static void main(String[] args) {
        int a,n;
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        a=reader.nextInt();
        System.out.print("Enter the value of n : ");
        n=reader.nextInt();
        System.out.println("a^n = "+compute(a, n));
        System.out.println("Thank you");
        reader.close();
    }
}

/*
 * Time Complexity : O(n)
 */