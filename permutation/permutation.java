import java.util.Scanner;
public class permutation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        perm(s.toCharArray(), 0);

    }
    static void perm(char[] c,int fix){
        if(fix==-c.length-1){
            System.out.println(c);
            return;
        }
        for(int i=fix;i<c.length;i++)
        {
        swap(c,i,fix);
        perm(c, fix+1);
        swap(c,i,fix);

            
        }
    }
    static void swap(char []c, int i,int fix){
        char temp= c[i];
        c[i]=c[fix];
        c[fix]=temp;
    }
}