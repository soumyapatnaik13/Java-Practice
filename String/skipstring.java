public class skipstring {
    public static void main(String[] args) {
        System.out.println(skip("baccapplecd"));
    }
    static String skip(String n){
        if(n.isEmpty()){
            return "";
        }

        if(n.startsWith("apple")){
            return skip(n.substring(5));
        }
        else{
            return n.charAt(0)+ skip(n.substring(1));
        }
    }

}
