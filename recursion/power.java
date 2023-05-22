public class power {
    /*
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x * power(x, n-1);
    }
     */
   // optimize approach
    public static double OptimizeApproachorPower(Double x , int n){
        if(n==0){
            return 1;
        }
        // this is for even numbers
        double halfpowsq =OptimizeApproachorPower(x,n/2) * OptimizeApproachorPower(x, n/2);
       // this is for odd number
        if(n%2!=0){
            halfpowsq = x *halfpowsq;
        }
        return halfpowsq;
    }
    public static void main(String[] args) {
        System.out.println(OptimizeApproachorPower(2.0, 10));
    }
}
