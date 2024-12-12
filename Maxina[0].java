public class temp3 {
    public static void main(String[] args) {
        int[][] arr={
            {6,2,3},
            {4,5,6},
            {7,8,9}
        };
        int min=arr[0][0];
        for(int i=0;i<arr[0].length;i++){
            if(arr[0][i]<min){
                min=arr[0][i];
            }
            
        }   
        System.out.println(min); 
    }
    
}
