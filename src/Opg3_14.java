import java.util.Scanner;
public class Opg3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Heads or tails good sir?");
        String answer = input.nextLine();
        int random = (int)(Math.random() * 2);

        if (random == 1 && answer.equals("heads"))
        System.out.print("nice guessing there");

        else if (random == 0 && answer.equals("tails"))
        System.out.println("you guessed right!");

        else
            System.out.print("you're wrong!");


    }
}
