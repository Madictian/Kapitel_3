import java.util.Scanner;

public class Opg3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.println("enter height in feet: ");
        double feet = input.nextDouble();
        System.out.println("and inches: ");
        double inches = input.nextDouble();


        double height = (feet * 12) + inches;

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightinkilograms = weight * KILOGRAMS_PER_POUND;
        double heightinmeters = height * METERS_PER_INCH;
        double bmi = weightinkilograms / (heightinmeters * heightinmeters);

        System.out.println("BMI is " + bmi);
        if (bmi > 18.5)
            System.out.println("underweight");
        else if (bmi > 25)
            System.out.println("normal");
        else if (bmi > 30)
            System.out.println("overweight");
        else
            System.out.println("obese");

    }
}
