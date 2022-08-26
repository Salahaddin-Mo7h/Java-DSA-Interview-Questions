/* Coin Chnging Problem
    Given a amount value, and set of coins available our task is to find maximum combination
    of the coins to make the amount.
    Type of Algorithm : Dynamic Programming.
 */
import java.util.Scanner;

public class CoinChanging{
    static int changing(int coins[],int amount){
        int[] combination = new int[amount+1];
        combination[0]=1;
        for(int coin : coins){
            for(int i=1;i<=amount;i++){
                if(i>=coin){
                    combination[i]+=combination[i-coin];
                }
            }
        }
        return combination[amount];
    }
    public static void main(String args[]){
        int amount,n;
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter no of coins: ");
        n=reader.nextInt();
        int[] coins=new int[n];
        System.out.print("Enter the coins list: ");
        for(int i=0;i<n;i++)
            coins[i]=reader.nextInt();
        System.out.print("Enter the amount value: ");
        amount=reader.nextInt();
        int ans= changing(coins,amount);
        System.out.println("Possible combination "+ans);
        reader.close();
    }
}