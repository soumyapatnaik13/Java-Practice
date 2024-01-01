public class phone {
    public static void main(String[] args) {
        number("", "12");
        
    }
    static void number(String p, String up){
        if(up.isEmpty()){
        System.out.println(p);
        return;
        }
        int num= up.charAt(0)-'0'; //1 gives me 1
        for(int i=(num-1)*3;i<num*3;i++){
            char c= (char)('a'+i);//convert the integer to char by adding char a
            number(p+c, up.substring(1));//c will holds the range
        }
    }
}
