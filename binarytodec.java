public class binarytodec {
    public static void Bintodec(int binnum){
        int mybin =  binnum;
        int pow = 0;
        int decnum=0; // this is always zero
        while(binnum>0){
          int lastdigit = binnum%10;
        decnum = decnum+(lastdigit *  (int) Math.pow(2, pow));
        pow++;
        binnum = binnum/10;
        }
        System.out.println("decimal of"+ mybin+ "=" + decnum);
    }
    public static void main(String[] args) {
        Bintodec(101);
        
    }
}
