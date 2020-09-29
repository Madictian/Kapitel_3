import java.util.Scanner;

public class Opg3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please give me a year and month");
        int aar = input.nextInt();
        int maaned = input.nextInt();
        switch (maaned - 1) {
            case 0 -> System.out.println("January has " + 31);
            case 1 -> {
                if (aar % 4 == 0)
                System.out.println("Febuary has " + 29);
                else
                    System.out.println("Febuary has " + 28);}
            case 2 ->
                System.out.println("March has" + 31);
            case 3 ->
                System.out.println("April has" + 30);
            case 4 ->
                System.out.println("May has " + 31);
            case 5 ->
                System.out.println("June has " + 30);
            case 6 ->
                System.out.println("July has " + 31);
            case 7 ->
                System.out.println("August has " + 31);
            case 8 ->
                System.out.println("September has " + 30);
            case 9 ->
                System.out.println("Oktober has " + 31);
            case 10 ->
                System.out.println("November has " + 30);
            case 11 ->
                System.out.println("December has " + 31);
        }
    }
}
