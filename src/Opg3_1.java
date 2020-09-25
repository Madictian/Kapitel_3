import java.util.Scanner;
public class Opg3_1 {
    public static void main(String[] args) {
        System.out.println("Enter values: a, b, c");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        double r_1 = (((-b) + Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a));

        double r_2 = (((-b) - Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a));

        if(discriminant > 0)
            System.out.println("root 1: " + r_1 + "\nroot 2: " + r_2);
        else if(discriminant == 0)
            System.out.println("root : " + r_1);
        else
            System.out.println("the equation has no real roots");
    }
}
