import java.util.Scanner;
public class Opg3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double x =(e * d - b * f) / (a * d - b * c);
        double y =(a * f - e * c) / (a * d - b * c);
        double fail_check = (a * d) - (b * c);
        if(fail_check == 0)
            System.out.println("the equation has no solution");
        else
            System.out.println("x= " + x + "\ny= " + y);

    }
}
