import java.util.Scanner;

public class phonenumber {
    
    public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    String s= sc.next();
    word(s,"");
    
    }
    static void word(String s,String ans){
      if(s.isEmpty()){
        System.out.println(ans);
        return;
        String [] keyboard={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        String k= keyboard[s.charAt(0)-48]; // take the index of that charachter and convert that in to decimal
        for(int i=0;i<k.length();i++){  
        word(s.substring(1), ans+k.charAt(i));
        }
      }
    }

}
