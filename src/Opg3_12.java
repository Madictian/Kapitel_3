import java.sql.SQLOutput;
import java.util.Scanner;

public class Opg3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a whole number with 3 digits");
        int digit = input.nextInt();
        int compare1 = 0;
        int compare2 = 0;

        if (digit >= 100 || digit >= 1000){

            compare1 = digit / 100;
            compare2 = digit % 10;
            if( compare1 == compare2){
                System.out.println("number is a palindrome");
            }else{
                System.out.println("number is not a palindrome");}}
        else {
            System.out.println("Fool, you broke the rules. stop being a cunt");
        }

    }
}
