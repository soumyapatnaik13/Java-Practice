public class skipcharobj {
    public static void main(String[] args) {
    System.out.println(skip("baccad"));
    }
    static String skip(String sorted){
        if(sorted.isEmpty()){
          return "";
        }
        char c = sorted.charAt(0);
        if(c=='a'){
           return  skip(sorted.substring(1));
        }
        else{
           return c+skip(sorted.substring(1));
        }
    }
}
