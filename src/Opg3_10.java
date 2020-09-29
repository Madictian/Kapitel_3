import java.util.Scanner;

public class Opg3_10 {
    public static void main(String[] args) {

            int number1 = (int)(Math.random() * 999) + 1;
            int number2 = (int)(Math.random() * 999) + 1;

            if(number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.println("what is " + number1 + " x " + number2 + "? ");
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();

            if (number1 * number2 == answer)
                System.out.println("You are correct!");
            else {
                System.out.println("Your answer is wrong");
                System.out.println(number1 + " x " + number2 + " should be " + (number1 * number2));

        }

    }
}
