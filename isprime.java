public class isprime {
    public static boolean isprimee(int n){
    // corner case
    //2
    if(n==2){
        return true;
    }
    for(int i=2;i<n-1;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}

    public static void main(String[] args) {
        System.out.println(isprimee(3));
        
    }
}
