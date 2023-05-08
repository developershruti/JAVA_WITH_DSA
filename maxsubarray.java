public class maxsubarray {
    public static void maxarraysum(int arr[]) {
        int currsum = 0;
        int maxarr = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {
                    currsum += arr[k];

                }
                System.out.println(currsum);
                if (maxarr < currsum) {
                    maxarr = currsum;
                }
            }
            System.out.println();

        }
        System.out.println("sum of max subarrays=" + maxarr);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        maxarraysum(arr);

    }
}
