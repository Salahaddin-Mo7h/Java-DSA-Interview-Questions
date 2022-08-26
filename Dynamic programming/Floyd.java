/*
    Floyd Warshell algorithm
    Given a directed graph with cost of the edges. Our task is to find the smallest
    distance between every pair of vertices.This problem is also called as all shortest path.
    Type of algorithm: Dynamic Programming.
 */

import java.util.Scanner;

public class Floyd{
    static int[][] graph=new int[10][10];
    static int v;
    static int[][] floyd(){
        int[][] dist = new int[v][v];
        for(int i=0;i<v;i++)
            for(int j=0;j<v;j++)
                dist[i][j]=graph[i][j];
        for(int k=0;k<v;k++)
            for(int i=0;i<v;i++)
                for(int j=0;j<v;j++)
                    if(dist[i][j]>dist[i][k]+dist[k][j])
                        dist[i][j]=dist[i][k]+dist[k][j];
        return dist;
    }
    static void printSolution(int[][] dist){
        System.out.println("The shortest distance of between every pair ");
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++)
                System.out.print(dist[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the number of vertices of the directed graph: ");
        v=reader.nextInt();
        System.out.println("Enter the grpah matrix (if infinity enter the value 9999)");
        for(int i=0;i<v;i++)
            for(int j=0;j<v;j++)
                graph[i][j]=reader.nextInt();
        printSolution(floyd());
        reader.close();
    }
}