public class CHECKPOWEROFTWO {
    public static boolean poweoftwo(int n){
        return (n & (n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(poweoftwo(4));
    }
}
