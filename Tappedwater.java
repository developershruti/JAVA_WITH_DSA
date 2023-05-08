public class Tappedwater {
    public static int trapping(int arr[]){
        int n = arr.length;
        // calculate left max boundary --- array
        int left[] = new int[n];
        left[0] = arr[0];
        for(int i=1;i<n;i++){
        left[i] = Math.max(arr[i], left[i-1]);
        }
          // calculate right max bounday --- array
          int right[] = new int [n];
          right[n-1] = arr[n-1];
          for(int i=n-2;i>=0;i--){
          right[i] = Math.max(arr[i], right[i+1]);
          }
          int trappedwater=0;
          for(int i=0;i<n;i++){
            // minimum value nikalne ke liye 
              int waterlevel = Math.min(left[i], right[i]);
              trappedwater += waterlevel-arr[i];
          }



        return trappedwater;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(trapping(arr));
    }
}
