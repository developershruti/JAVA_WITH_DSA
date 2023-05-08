public class palindrome {
    public static void palinnum(int n) {
        int p = 0,temp ;
        temp=n;
        while (n > 0) {
            int rem = n % 10;
            p = (p * 10) + rem;
            n = n / 10;

        }
        if(p==temp)
        System.out.println("palindrome number");
        else
        System.out.println("not palindrome");
    }

    public static void main(String[] args) {
      palinnum(141);
    }
}
