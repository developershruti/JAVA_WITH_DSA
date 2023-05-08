import java.util.Scanner;

class primeornot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();

        if (n == 2) {
            System.out.println("prime number");
        } else {

            boolean prime = true;
            // for(int i=2;i<n-1;i++)

            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                }
            }
            if (prime == true) {
                System.out.println("number is prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}