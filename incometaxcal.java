import java.util.Scanner;
public class incometaxcal {
    public static void main(String[] args) {
       
        System.out.println("Enter the income");
        Scanner r = new Scanner(System.in);
        int income = r.nextInt();
        int tax;
         if(income<500000){
            tax = (int) (income*(0.0));
        }
        else if(income >=500000 && income<1000000 ){
            tax = (int) (income*(0.2));
        }
        else{
            tax = (int) (income*(0.3));
        }
        System.out.println("Your tax is="+tax);

    }
}
