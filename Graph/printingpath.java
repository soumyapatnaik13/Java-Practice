import java.util.ArrayList;

public class printingpath {
    public static class Edges{
        int source;
        int destination;
        Edges(int s,int d){
        this.source=s;
        this.destination=d;
        } 
    }
    public static void creategraph(ArrayList<Edges> graph[]){
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
        graph[5].add(new Edges(5, 6));

        graph[6].add(new Edges(6,5));
    }
    static void paths(ArrayList<Edges> graph[],boolean isVisited[],int start, String s,int target){
        if(start==target){
            System.out.println(s + target);
            return;
        }
        if(isVisited[start]== true){
            return;
        }
        isVisited[start]=true;
        for(int i=0;i<graph[start].size();i++){
            Edges e= graph[start].get(i);
            paths(graph, isVisited, e.destination, s + e.source + " => ", target);
           
        }
        isVisited[start]=false;
    }

    public static void main(String[] args) {
           int vertices=7;
        ArrayList<Edges> graph[]= new ArrayList[vertices];
        // in each array the type is arraylist
        creategraph(graph);
        boolean isVisited[]= new boolean[vertices];//false
        String s=" ";
        int target=5;
        paths(graph,isVisited,0,s,target);
    }
}
