import java.util.*;
public class BFS {
    public static class Edges{
        int source;
        int destination;
        Edges(int s,int d){
            this.source=s;
            this.destination=d;
        }
    }
      public static void addElemnt(ArrayList<Edges> graph[]){
          for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
          }
          graph[0].add(new Edges(0,1));
          graph[0].add(new Edges(0, 2));

          graph[1].add(new Edges(1, 0));
          graph[1].add(new Edges(1, 3));

          graph[2].add(new Edges(2,0));
          graph[2].add(new Edges(2,4));
          
          graph[3].add(new Edges(3,1));
          graph[3].add(new Edges(3,4));
          graph[3].add(new Edges(3,5));

          graph[4].add(new Edges(4,2));
          graph[4].add(new Edges(4,3));
          graph[4].add(new Edges(4,5));

          graph[5].add(new Edges(5,3));
          graph[5].add(new Edges(5,4));

          graph[6].add(new Edges(6,5));
      }
      static void BfS(ArrayList<Edges>graph[],int vertices){
      Queue<Integer> ans= new LinkedList<>();
      int ele= 0;
      ans.add(ele);
      boolean []isVisited= new boolean[vertices];
      while(ans.isEmpty()){
         int v= ans.remove();
         if(isVisited[v]==false){
            System.out.println(v);
            isVisited[v]=true;
            for(int i=0;i<graph[v].size();i++){
                Edges e2= graph[v].get(i);
                ans.add(e2.destination);
            }
            
         }

      }

      }
    
    public static void main(String[] args) {
        int vertices=7;
        ArrayList<Edges> graph[]= new ArrayList[7];
        addElemnt(graph);
        for(int i=0;i<graph[2].size();i++){
            Edges e=graph[2].get(i);
            System.out.println(e.destination);
        }
        BfS(graph,vertices);
    }
}
