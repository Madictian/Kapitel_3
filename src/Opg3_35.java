import java.util.Scanner;
public class Opg3_35 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int OddorEeven = input.nextInt();

    if (OddorEeven % 2 == 1)
        System.out.println("odd");
    else
        System.out.print("even");
    }
}
