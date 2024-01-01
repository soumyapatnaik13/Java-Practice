import java.util.Scanner;
public class bubblesort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your elements: ");
		
		int n = sc.nextInt();
		
		int [] arr= new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
	
		 bubblesor(arr);
		 
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
		
		static void bubblesor(int []arr) {
		 for(int i=0;i<arr.length-1;i++) {
			 for(int j=0;j<arr.length-i-1;j++) {
				 if(arr[j]>arr[j+1]) {
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				 }
			 }
            }
        }
    }

