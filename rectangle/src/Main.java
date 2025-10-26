import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        rectangle rectangle1 = new rectangle();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Width of the rectangle: ");
         rectangle1.width = sc.nextDouble();

        System.out.println("Enter the height of the rectangle: ");
            rectangle1.height = sc.nextDouble();

        System.out.println("Area: " + rectangle1);

    }
}