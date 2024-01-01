public class maze {
    public static void main(String[] args) {
        int r=2;
        int c=2;
        int count= func(1,1,r,c);
        System.out.println(count);
    }
    
    static int func(int sr,int sc,int r,int c){
        if(sr>r || sc>c){
            return 0;
        }
        if(sr==r && sc==c ){
            return 1;
        }

        int downways = func(sr+1, sc, r, c);
        int rightways=func(sr,sc+1,r,c);
        int totalways= downways + rightways;
        return totalways;
        }
    }

