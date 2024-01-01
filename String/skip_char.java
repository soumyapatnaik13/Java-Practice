public class skip_char{
    public static void main(String[] args) {
    skip("","baccad");
    }
    static void skip(String sorted, String unsorted){
        if(unsorted.isEmpty()){
            System.out.println(sorted);
            return;
        }
        char c= unsorted.charAt(0);
        if(c=='a'){
           skip(sorted, unsorted.substring(1));
        }
        else{
            skip(sorted+c, unsorted.substring(1));

        }
    }
}