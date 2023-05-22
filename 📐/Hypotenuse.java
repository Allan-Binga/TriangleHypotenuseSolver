import java.util.Scanner;

public class Hypotenuse extends Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[33m"); // sets text color to yellow
        System.out.println("Welcome to the Hypotenuse Calculator!");
        System.out.print("\033[0m"); // resets text color to default

        System.out.print("\n\033[34m"); // sets text color to blue
        System.out.println("How many triangles would you like to calculate the hypotenuse for?");
        System.out.print("\033[0m"); // resets text color to default
        int numTriangles = scanner.nextInt();

        double[] hypotenuses = new double[numTriangles];

        for (int i = 0; i < numTriangles; i++) {
            System.out.print("\n\033[36m"); // sets text color to cyan
            System.out.println("Enter side x for triangle " + (i + 1) + ":");
            System.out.print("\033[0m"); // resets text color to default
            double x = scanner.nextDouble();
            System.out.print("\n\033[36m"); // sets text color to cyan
            System.out.println("Enter side y for triangle " + (i + 1) + ":");
            System.out.print("\033[0m"); // resets text color to default
            double y = scanner.nextDouble();

            double z = Math.sqrt((x * x) + (y * y));
            hypotenuses[i] = z;

            System.out.print("\n\033[32m"); // sets text color to green
            System.out.println("The hypotenuse for triangle " + (i + 1) + " is: " + z);
            System.out.print("\033[0m"); // resets text color to default
        }

        System.out.print("\n\033[35m"); // sets text color to magenta
        System.out.println("All hypotenuses calculated:");
        System.out.print("\033[0m"); // resets text color to default
        for (int i = 0; i < numTriangles; i++) {
            System.out.println("Triangle " + (i + 1) + ": \033[32m" + hypotenuses[i] + "\033[0m"); // sets text color to
                                                                                                   // green for
                                                                                                   // hypotenuse value
        }

        System.out.print("\n\033[33m"); // sets text color to yellow
        System.out.println("Thank you for using the Hypotenuse Calculator!");
        System.out.print("\033[0m"); // resets text color to default
    }
}
