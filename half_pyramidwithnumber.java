public class half_pyramidwithnumber {
    public static void half_pyramidnumber(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        half_pyramidnumber(7);
    }
}
