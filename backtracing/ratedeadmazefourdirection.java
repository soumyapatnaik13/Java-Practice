public class ratedeadmazefourdirection {
    public static void main(String[] args) {
        int r=3;
        int c=3;
        int[] []arr={{0,0,1},
                     {0,0,0},
                     {1,0,0}
    };
   boolean[][] isvisited= new boolean[r][c];
    func(0,0,r-1,c-1,"",arr,isvisited);
    }
    static void func(int sr,int sc,int r,int c,String p,int [][]arr, boolean isvisited[][]){
      if(sr>r || sc>c){
        return;
      }
      if(sr<0 || sc<0){
        return;
      }
      if(sr==r && sc==c){
        System.out.println(p);
        return;
      }
      if(arr[sr][sc]==1)return;
      if(isvisited[sr][sc]==true) {
        return;
      }
      isvisited[sr][sc]=true;
      func(sr+1, sc, r, c, p+"D", arr, isvisited);
      func(sr, sc+1, r, c, p+"R", arr, isvisited);
      func(sr-1, sc, r, c, p+"U", arr, isvisited);
      func(sr, sc-1, r, c, p+"L", arr, isvisited);
      isvisited[sr][sc]=false;
    }
}
