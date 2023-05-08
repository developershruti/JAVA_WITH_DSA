public class sumofdigit {
    public static int sumdigit(int n){
        int p=0;
        while (n > 0) {
            int rem = n % 10;
            p = p  + rem;
            n = n / 10;
    }
    return p;
}
    public static void main(String[] args) {
        System.out.println(sumdigit(12345));
    }
}
