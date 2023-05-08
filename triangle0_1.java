public class triangle0_1 {
    public static void tri0_1(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        tri0_1(5);
    }
}
