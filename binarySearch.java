public class binarySearch {

    public static int search(int arr[],int key){
        int s = 0; int e = arr.length-1;
        
        while(s<=e){
         int mid = (s+e)/2;
         if(arr[mid]==key){
                return mid;
            }
             else if(arr[mid]<key){
                s = mid+1;
            }
            else{
                e=mid-1;
            }
            
        }
        return -1;
                   
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key = 8;
        System.out.println(search(arr, key));
    }
}
