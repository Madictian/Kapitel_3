import java.util.Scanner;
public class Opg3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first   = input.nextInt();
        int second  = input.nextInt();
        int third   = input.nextInt();

        if (first < second && first < third) {
            if (second < third)
                System.out.print(first + " < " + second + " < " + third);
            else
                    System.out.print(first + " < " + third + " < " + second);
        }
        else if (second < first && second < third){
            if (first < third)
                System.out.print(second + " < " + first + " < " + third);
            else
                System.out.print(second + " < " + third + " < " + first);}
        else if(third < first && third < second)  {
            if (first < second)
                System.out.print(third + " < " + first + " < " + second);
            else
                    System.out.print(third + " < " + second + " < " + first);

        }
    }
}
