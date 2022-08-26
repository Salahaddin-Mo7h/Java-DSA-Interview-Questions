/*
 * String matching (Pattern Mactching)
 */

import java.util.Scanner;

public class StringMatching {
    static int matching(String str, String pattern){
        int index=-1;
        int j,k;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==pattern.charAt(0)){
                int found=0;
                for(j=0,k=i;j<pattern.length()&&k<pattern.length();j++,k++){
                    if(str.charAt(k)!=pattern.charAt(j)){
                        found=1;
                        break;
                    }
                if(found==0)
                    index=i;
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
       Scanner reader =new Scanner(System.in);
       String str,pattern;
       System.out.print("Enter the string: ");
       str=reader.next();
       System.out.print("Enter the pattern: ");
       pattern=reader.next();
       int x=matching(str, pattern);
       if(x==-1)
            System.out.println("The pattern is not presented in the string");
       else
            System.out.println("The pattern is in presented in the string \nIndex: "+x);    
       reader.close();
    }
}
/*
 * Time complexity : O(n^2)
 */
