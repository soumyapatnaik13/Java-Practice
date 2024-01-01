public class mazewithoutvisited {
    public static void main(String[] args) {
        int r=3;
        int c=3;
        int[] []arr={{0,0,1},
                     {0,0,0},
                     {1,0,0}
    };
   
    func(0,0,r-1,c-1,"",arr);
    }
    static void func(int sr,int sc,int r,int c,String p,int [][]arr){
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
      if(arr[sr][sc]==-1) {
        return;
      }
      arr[sr][sc]=-1;
      func(sr+1, sc, r, c, p+"D", arr);
      func(sr, sc+1, r, c, p+"R", arr);
      func(sr-1, sc, r, c, p+"U", arr);
      func(sr, sc-1, r, c, p+"L", arr);
      arr[sr][sc]=0;
    }
}
