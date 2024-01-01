import java.util.ArrayList;
public class dice {
    public static void main(String[] args) {
       System.out.println( func("",4));
    }
    static ArrayList<String> func(String target,int num){
        if(num==0){
            ArrayList<String>list= new ArrayList<>();
            list.add(target);
            return list;
        }
        ArrayList<String>ra=new ArrayList<>();
        for(int i=1;i<=6 && i<=num;i++){
           ra.addAll (func(target+i, num-i));
            
        }
        return ra;
    }
}
