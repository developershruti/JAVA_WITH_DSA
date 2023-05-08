public class floydstriangle {
    public static void floydstri(int n){
        int k = 1;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
             System.out.print(k+" ");
             k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydstri(5);
    }
}
