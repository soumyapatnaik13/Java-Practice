public class mage{
    public static void main(String[] args) {
        boolean [][] arr ={
            {true,true,true},
            {true,true,true},
            {true,true,true}
                       };
     func(arr,"",0,0);

    }
    static  void func(boolean[] []arr,String p,int r, int c){
        if(r==arr.length-1 && c==arr[0].length-1){
            System.out.println(p);
            return;
        }
      if(!arr[r][c]){
        return;
      }
      arr[r][c]=false;
     if(r<arr.length-1){
        func(arr,p+'D',r+1,c);
     }
     if(c<arr[0].length-1){
        func (arr,p+'R', r, c+1);
     }
     if(r<0){
        func(arr,p+'U',r-1,c);
     }
     if(c<0){
        func(arr,p+'L',r,c-1);
     }
     arr[r][c]=true;
    }
}