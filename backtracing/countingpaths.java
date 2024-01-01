public class countingpaths {
    public static void main(String[] args) {
       int r=3;
       int c=3;
       boolean [][] isvisited= new boolean[r][c];
       func(0, 0, r-1, c-1,"",isvisited);

    }
    static void  func(int sr,int sc,int r,int c,String p,boolean[][]isvisited){
        
          if(sr<0|| sc<0){ // case for left and up
            return;
        }
        if(sr>r || sc>c){ // base case starting row should go till length
            return;
        }
        if(isvisited[sr][sc]==true)return;
    //    if( isvisited[sr][sc]==true)return;
      
        if(sr==r && sc==c){
        System.out.println(p);
        return;
        }
        isvisited[sr][sc]=true;
        func(sr+1, sc, r, c, p+"D",isvisited);
        func(sr, sc+1, r, c, p+"R",isvisited);
        func(sr, sc-1, r, c, p+"L",isvisited);
        func(sr-1,sc,r,c,p+"U",isvisited);
        //backtracking
        isvisited[sr][sc]=false;  
    }

}
