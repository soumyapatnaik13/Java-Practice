public class bubblesort{
    public static void main(String[] args) {
        int [] arr ={5,3,1,2,6};
        bubble(arr);
        for(int num:arr){
            System.out.println(num);
        }
    }
    static void bubble(int [] arr){
        
        for(int i=0;i< arr.length-1;i++){
           boolean swapped=false;
        for(int j=0; j< arr.length-i-1;j++){
              if(arr[j]>arr[j+1]){
                 int temp= arr[j];
                 arr[j]= arr[j+1];
                arr[j+1]= temp;
                swapped = true;
                  }
            
           } 
           if(!swapped){
            break;
            
        }
        
        }
    }

}  
    
