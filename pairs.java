public class pairs {
    public static void arraypairs(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
         int currr = arr[i];
         for(int j=i+1;j<arr.length;j++){
            System.out.print("("+currr +","+ arr[j] + ")");
            tp++;
         }
         System.out.println();
        }
        System.out.println("total number of pairs="+ tp);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
       arraypairs(arr);
    }
}
