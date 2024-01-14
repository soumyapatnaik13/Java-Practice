package backtracking;
import java.util.ArrayList;
public class RateInMaze2direction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// use recursion
		/*
		 * approach it will goes in two direction either down or right
		 * so we can say either left or right
		 * so if it is a 3*3 matrix 
		 * so row will break till 3
		 * column will break till 3
		 */
		int row=3;
		int col=3;
		int [][] maze= new int[row][col];
		 int ans=findthepath(maze,1,1,row,col);
		 System.out.println(ans);
		  
		  }
		
			
		
		static int findthepath(int [][] maze,int start,int end, int row ,int col) {
			int totalpath=0;
			if(start > row || end >col) {
				return 0;
			}
			if(start == row && end ==col) {
				return 1;
			}
			int left=findthepath(maze,start+1,end,row,col);
			int right=findthepath(maze,start,end+1,row,col);
			totalpath=left + right;
			
			return totalpath;
		}

	}


