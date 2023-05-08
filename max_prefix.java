public class max_prefix {
    public static void maxsubarray(int []arr){
    int currsum =0;
    maxsub = Integer.MIN_VALUE;
    int prefix[] = new int [arr.length];
    int prefix[0] = arr[0];
    for(int i=1;i<prefix.length;i++){
        // prefix += prefix[i-1] + arr[i];
        prefix[i] +=prefix[i-1]+arr[i];
    }
    for(int i=0;i<arr.length;i++){
        int start =i;
        for(int j=i;j<arr.length;j++){
            int end =j;
            currsum = start==0? prefix[end] : prefix[end] - prefix[start-1];

            if(maxsub<currsum){
                maxsub = currsum;
            }

        }
    }
    System.out.println("Maxsubarray value is ="+ maxsub);
}
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        maxsubarray(arr);
    }
}

