import java.util.Scanner;

public class Opg3_15 {
    public static void main(String[] args) {
        int lottery = (int)(Math.random() * 1000);

        Scanner input = new Scanner(System.in);
        System.out.println("enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        int lotterydigit1 = lottery / 10;
        int lotterydigit2 = lottery % 10;
        int lotterydigit3 = lottery / 100;

        int guessdigit1 = guess / 10;
        int guessdigit2 = guess % 10;
        int guessdigit3 = guess / 100

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery)
            System.out.println("Exact match: you win 10000 dollars");
        else if (guessdigit2 == lotterydigit1
                && guessdigit1 == lotterydigit2
                &&)
            System.out.println("match all digits, you win 3000 dollars");
        else if (guessdigit1 == lotterydigit1
                || guessdigit1 == lotterydigit2
                || guessdigit2 == lotterydigit1
                || guessdigit2 == lotterydigit2)
            System.out.println("match one digit, you win 1000 dollars");
        else
            System.out.println("Sorry, no match");
}
//Not done