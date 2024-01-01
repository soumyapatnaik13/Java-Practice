public class countstep {
    public static void main(String[] args) {
    int num =14;
    int ans=steps(num);
    System.out.println(ans);
}
static int steps(int num){
    return help(num,0);
}
static int help(int num,int count){
    if(num=0){
        return count;

    }
    if(num % 2==0){
        help(num, count+1);
    }
    else{
        help(num, count+1);
    }

    }

}