public class permutationstring {
    public static void main(String[] args) {
       System.out.println( permutation("","abc"));
    }
    static int permutation(String p, String up){
        if(up.isEmpty()){
            
            return 1;
        }
        int count = 0;
       char c= up.charAt(0);
       for(int i=0;i<=p.length();i++){
        String f = p.substring(0,i);//ba 
        String e= p.substring(i,p.length());//ab
        count=count + permutation(f+c+e, up.substring(1));

       }
       return count;
    }
}
