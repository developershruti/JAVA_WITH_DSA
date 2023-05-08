import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        // int x = 9, y = 12;
        // int a = 2, b = 4, c = 6;
        // int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        // System.out.println(exp);


        int x, y, z;
        x = y = z = 2;
       x += y;
       y  -= z;
       z /= (x + y);
       System.out.println(x + " " + y + " " + z);

       // ques2
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>0){
            System.out.println("positive number");
        }
        else{
            System.out.println("negative number");
        }
        // ques3
        System.out.println("Enter the number");
        Scanner sc1 = new Scanner(System.in);
        double temp = sc1.nextDouble();
        if(temp>100){
            System.out.println("fever");
        }
        else{
            System.out.println("not fever");
        }

        System.out.println("Enter the number");
        Scanner a = new Scanner(System.in);
        int choice = a.nextInt();
        switch(choice){
            case 1:
            System.out.println("monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("wednesday");
            break;
            case 4: System.out.println("Thrusday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default: System.out.println("Invalid choice");
          }
        // ques5
        System.out.println("Enter the number");
        Scanner sc3 = new Scanner(System.in);
        int year = sc3.nextInt();
        if((year%400==0) || ((year%4==0) && (year%100 !=0))){
            System.out.println("leap year");
        }
        else{
            System.out.println("Non - leap year");
        }


    }
}
