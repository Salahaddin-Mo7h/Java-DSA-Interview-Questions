/*
 * Closest pair problem
 */

import java.util.Scanner;

class Points{
    int x,y;
}

public class ClosestPair {
    static Points[] p = new Points[10];
    static double distance(Points p1,Points p2){
        double x= Math.pow(p1.x+p2.x, 2);
        double y=Math.pow(p1.y+p2.y, 2);
        return Math.sqrt(x+y);
    }
    static double calculate(int n){
        double mindistance=distance(p[0],p[1]);
        for(int i=1;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(distance(p[i], p[j])<mindistance)
                    mindistance=distance(p[i], p[j]);
            }
        }
        return mindistance;
    }
    
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        int n;
        System.out.print("Enter the number of points: ");
        n=reader.nextInt();
        System.out.println("Enter the points (x,y)");
        for(int i=0;i<n;i++){
            System.out.print("Point "+i+" : ");
            p[i]=new Points();
            p[i].x=reader.nextInt();
            p[i].y=reader.nextInt();
        }
        System.out.println("The closest pair distance: "+calculate(n));
        reader.close();
    }
}
/*
 * Time complexity : O(n^2)
 */