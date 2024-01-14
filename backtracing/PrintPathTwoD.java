package backtracking;

public class PrintPathTwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=3;
		int col=3;
		int [][] maze= new int[row][col];
		 findthepath(maze,"",1,1,row,col);
		 
		  
		  }
		
			
		
		static void findthepath(int [][] maze,String s,int start,int end, int row ,int col) {
		
			if(start > row || end >col) {
				return;
			}
			if(start == row && end ==col) {
				System.out.println(s);
				return;
			}
			findthepath(maze,s+'D',start+1,end,row,col);
		    findthepath(maze,s+'R',start,end+1,row,col);
		
		
	}

}
