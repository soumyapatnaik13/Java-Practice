import java.util.Stack;

public class infixUsingStack{
    public static void main(String[] args) {
       String str= "9*2+5-2*6+1-3/12";
      Stack<Integer>val= new Stack<>();
      Stack<Character>op= new Stack<>();
        for(int i=0;i<s.length();i++) {
        char c= str.charAt(i);
         int asci= (int)c(i);
         if(asci>=48 && asci<58) {
           val.push(asci-48);
         }
         else if(op.size()==0) {
           op.push(c(i));
         }
         else {
           if(c(i)=='+' || c(i)=='-') {
             int val2= val.pop();
             int val1= val.pop();
             if(op.peek()=='+') val.push(val1+val2);
             if(op.peek()=='-') val.push(val1-val2);
             if(op.peek()=='*') val.push(val1*val2);
             if(op.peek()=='/') val.push(val1/val2);
             op.pop();
             op.push(s.charAt(i));
             }
            if(c(i)=='*' || c(i)=='/'){
              if(op.peek()=='*' || op.peek() =='/'){
              int val2= val.pop();
             int val1= val.pop();
             if(op.peek()=='*') val.push(val1*val2);
             if(op.peek()=='/') val.push(val1/val2);
             op.pop();
             op.push(s.charAt(i));
              }
              else{
                st.push(c);
              }
            }          
    }
  }
  while(val.size()>1){
    int val1= val.pop();
    int val2= val.pop();
     if(op.peek()=='+') val.push(val1+val2);
             if(op.peek()=='-') val.push(val1-val2);
             if(op.peek()=='*') val.push(val1*val2);
             if(op.peek()=='/') val.push(val1/val2);
  op.pop();

  }
  System.out.println(val);

    }
  }