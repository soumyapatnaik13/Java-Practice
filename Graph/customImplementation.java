//we will stores graph as array of arrylist
import java.util.*;
public class customImplementation{
    public static class Edges{
       int source;
       int destination;
       int weight;
       Edges(int s,int d,int w){
        this.source=s;
        this.destination=d;
        this.weight=w;
       }
    }
        public static void creategraph(ArrayList<Edges>graph[]){
        for(int i=0;i<graph.length;i++){
         graph[i]= new ArrayList<>();//null value to empty list
        }

        graph[0].add(new Edges(0,2,2));
        
        graph[1].add(new Edges(1,2,10));
        graph[1].add(new Edges(1,3,0));

        graph[2].add(new Edges(2,0,2));
        graph[2].add(new Edges(2,1,10));
        graph[2].add(new Edges(2,3,-1));

        graph[3].add(new Edges(3,1,0));
        graph[3].add(new Edges(3,2,-1));        
    }
    
   public static void main(String[] args) {
        int vertices=4;
        ArrayList<Edges> graph[]= new ArrayList[vertices];
        creategraph(graph);
        for(int i=0;i<graph[1].size();i++){
          Edges e= graph[1].get(i);
          System.out.println(e.weight);
        }

    }
}