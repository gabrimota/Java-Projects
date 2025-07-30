import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double areax, areay;
        Square x , y;
        x = new Square();
        y = new Square();

        System.out.println("Enter the values of square x: ");
            x.a = sc.nextDouble();
            x.b = sc.nextDouble();
            x.c = sc.nextDouble();
        System.out.println("Enter the values of square y: ");
            y.a = sc.nextDouble();
            y.b = sc.nextDouble();
            y.c = sc.nextDouble();
         areax = x.CalculateSquareArea();
         areay = y.CalculateSquareArea();

        System.out.println("Area of the square X is: " + areax);
        System.out.println("Area of the square Y is: " + areay);
    }
}