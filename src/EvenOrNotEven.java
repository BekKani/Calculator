
import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenOrNotEven {

    //Variables declaration
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write your number from 1 to 100");
        int number =scanner.nextInt();

              if (number % 2==0) {
                  System.out.println(" Your number is Even");
              }
              else {
                  System.out.println("Your number is Odd");
              }




    }
}
