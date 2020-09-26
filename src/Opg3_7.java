import java.util.Scanner;
public class Opg3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount in double: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int numberofDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberofQuarter = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberofDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberofNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int pennies = remainingAmount;

        if (numberofDollars > 1 || numberofDollars == 0)
        System.out.println("Dollars " + numberofDollars);
        else
        System.out.println(numberofDollars + " Dollar");

        if (numberofQuarter > 1 || numberofQuarter == 0)
            System.out.println("Quarters " + numberofQuarter);
        else
            System.out.println(numberofQuarter + " Quarters");

        if (numberofDimes > 1 || numberofDimes == 0)
            System.out.println("Dimes " + numberofDimes);
        else
            System.out.println(numberofDimes + " Dime");

        if (numberofNickels > 1 || numberofNickels == 0)
            System.out.println("Nickels " + numberofNickels);
        else
            System.out.println(numberofNickels + " Nickel");

        if (pennies > 1 || pennies == 0)
            System.out.println("pennies " + pennies);
        else
            System.out.println(pennies + " penny");

    }
}
