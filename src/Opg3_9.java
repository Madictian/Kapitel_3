import java.util.Scanner;

public class Opg3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ISBN = input.nextInt();

        int d9 = (ISBN / 100000000) % 10;
        int d8 = (ISBN / 10000000) % 10;
        int d7 = (ISBN / 1000000) % 10;
        int d6 = (ISBN / 100000) % 10;
        int d5 = (ISBN / 10000) % 10;
        int d4 = (ISBN / 1000) % 10;
        int d3 = (ISBN / 100) % 10;
        int d2 = (ISBN / 10) % 10;
        int d1 = ISBN % 10;

        int checksum = (d9 * 1 + d8 * 2 + d7 * 3 + d6 * 4 + d5 * 5 + d4 * 6 + d3 * 7 + d2 * 8 + d1 * 9) % 11;

        if (checksum == 10)
            System.out.print("The ISBN-19 number is :" + d9 + d8 + d7 + d6 + d5 + d4 + d3 + d2 + d1 + "x");
        else
            System.out.print("The ISBN-19 number is :" + d9 + d8 + d7 + d6 + d5 + d4 + d3 + d2 + d1 + checksum);
    }
}
