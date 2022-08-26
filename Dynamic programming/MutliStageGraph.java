/*
  MultiStage Graph
  A direct weighted graph is given in which the vertices are divided into different stages.Our task is to 
  find the minimal cost path between source and destination.Backward approach is used to solve this problem. 
 */

import java.util.Scanner;

public class  MutliStageGraph {
    static int[][] graph=new int[10][10];
    static int INF = 9999;
    static int v;
    static int calculate(){
        int[] dist=new int[v];
        dist[v-1]=0;
        for(int i=v-2;i>=0;i--){
            dist[i]=INF;
            for(int j=i;j<v;j++){
                if(graph[i][j]==INF)
                    continue;
                else
                    dist[i]=Math.min(dist[i], graph[i][j]+dist[j]);
            }
        }
        return dist[0];
    }
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        v=reader.nextInt();
        System.out.println("Enter the directed weight graph (if infinity enter the value 9999");
        for(int i=0;i<v;i++)
            for(int j=0;j<v;j++)
                graph[i][j]=reader.nextInt();
        System.out.println("The minimum cost of between source and destination is "+calculate());
        reader.close();
    }
}
