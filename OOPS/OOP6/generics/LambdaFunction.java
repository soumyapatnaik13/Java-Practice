//import java.util.List;
import java.util.ArrayList;
public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(i+1);
        }

        list.forEach((item) -> System.out.println(item*2));
    }

}
