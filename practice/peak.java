public class peak {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr = {1,3,5,9,4,2};
      int target=4;
      int peakindex=peakindexinmountainarray(arr);
      int targetindex=orderAgnosticBinarySearch(arr,target);
	
      System.out.println(peakindex);
      System.out.println(targetindex);
      
	
	}
	
	static int peakindexinmountainarray(int [] arr){
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			int mid= start+(end-start)/2;
			
			if(arr[mid]>arr[mid+1]) {
			end=mid;
		}
			else {
				start=mid+1;
			}
	}
		return start;
	}

		
	static int orderAgnosticBinarySearch(int []arr,int target) {
		int start=0;
		int end=arr.length-1;
		
		boolean isAsc=arr[start]<arr[end];
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(isAsc) {
				if(target<arr[mid]) {
					end=mid-1;
					
				}
				else {
					start=mid+1;
				}
			}
			else {
				if(target>arr[mid]) {
					
				end=mid-1;
			}
				else {
					start=mid+1;
				}
		}
		}
			return -1;
			
		
	}
}
