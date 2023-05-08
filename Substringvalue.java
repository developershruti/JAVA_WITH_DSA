public class Substringvalue {
    public static String geString( int si , int ei ,String str){
        String sub = "";
        for(int i =si;i<ei;i++){
            sub += str.charAt(i);
        }
        return sub;
        
    }
    public static void main(String[] args) {
        String str = "shrutityagi";
        System.out.println(geString(0, 5, str));
       
      //  System.out.println( str.substring(0, 5));
    }
}
