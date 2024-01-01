public class main{
    public static void main(String[] args) {
        int a =5;
        int b=0;
         try{
        div(a,b);
         }catch(Exception e){
            System.out.println(e.getMessage());
         }
    }
   static int div(int a,int b) throws Exception{ //it may throw an exception
    if(b==0){
        throw new Exception("please donot divide by zero");
    }
        return a/b;
    }
}