import java.util.Scanner;
public class Opg3_5 {
    public static void main(String[] args) {
        System.out.print("enter number of days: ");
    Scanner input = new Scanner(System.in);
    int weekday = input.nextInt();
        switch ( weekday % 7 ) {
            case 0: System.out.println("sunday"); break;
            case 1: System.out.println("monday"); break;
            case 2: System.out.println("tuesday"); break;
            case 3: System.out.println("wednesday"); break;
            case 4: System.out.println("thursday"); break;
            case 5: System.out.println("friday"); break;
            case 6: System.out.println("saturday"); break;

        }
        System.out.print("enter number of days after: ");
        int future_weekday = input.nextInt() + weekday;

        switch ( future_weekday % 7 ) {
            case 0: System.out.println("sunday"); break;
            case 1: System.out.println("monday"); break;
            case 2: System.out.println("tuesday"); break;
            case 3: System.out.println("wednesday"); break;
            case 4: System.out.println("thursday"); break;
            case 5: System.out.println("friday"); break;
            case 6: System.out.println("saturday"); break;

        }

    }
}
