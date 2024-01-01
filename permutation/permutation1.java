public class permutation1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
     String up= "abc";
     func(up,"");
     
	}
	static void func(String up,String p) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
	for(int i=0;i<up.length();i++) {
		char c= up.charAt(i); //a
		String left=up.substring(0,i);
		String right= up.substring(i+1);
		String merge= left+right;
		func(merge,p+c);
		
	} 
}
}
