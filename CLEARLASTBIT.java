public class CLEARLASTBIT {
    public static int clearbits(int n ,int i){
        int bitmask = (~0)<<i;
        return (n & bitmask);
    }
    public static void main(String[] args) {
        System.out.println(clearbits(15, 2));
    }
}
