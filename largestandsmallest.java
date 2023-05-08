
public class largestandsmallest {
    public static int element(int arr[]){
        int largest = Integer.MIN_VALUE; // -infiity
         int smallest = Integer.MAX_VALUE; // +infinity
        
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println("smallest value is= "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,2,6,8};
       // System.out.println("largest value is"+ largest);
       System.out.println("Largest value is= "+element(arr));
    }
   
}
