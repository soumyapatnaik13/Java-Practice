public class Nqueen {
    public static void main(String[] args) {
        int n=4;
        char [][] arr= new char[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]='X';
            }    
        }
        func(arr,0);
    }
    static void func(char[][]arr,int row){
        int n=arr.length;
       if(row==n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return;
       }
        for(int j=0;j<arr.length;j++){
            if(issafe(arr,row,j)){
                arr[row][j]='Q';
                func(arr, row+1);
                arr[row][j]='X';//backtracking

            }
        }
    }
    static boolean issafe(char [][]arr, int row,int col){
        int n= arr.length;
        //row
        for(int j=0;j<n;j++){
            if(arr[row][j]=='Q'){
                return false;
            }   
        }
        //col
        for(int i=0;i<n;i++){
            if(arr[i][col]=='Q'){
                return false;
            }
        }
        //northeast

     int i= row;
     int j=col;
     while(i>=0&&j<n){
        if(arr[i][j]=='Q'){
            return false;
        }
        i--;
        j++;
     }
     //southeast
    i=row;
    j=col;
    while(i<n && j<n){
         if(arr[i][j]=='Q'){
            return false;
    }
    i++;
    j++;
}
//northeast
   i=row;
    j=col;
    while(i>=0&&j>=0){
     if(arr[i][j]=='Q'){
            return false;
    }
    i--;
    j--;
}

i=row;
j=col;
   while(i<n&&j>=0){
      if(arr[i][j]=='Q'){
            return false;
   }
   i++;
   j--;
}
return true;
    }
}
