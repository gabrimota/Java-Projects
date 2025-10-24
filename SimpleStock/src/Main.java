import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Stock  product1 , product2, product3;

        product1 = new Stock();


        System.out.println("Enter Product Data: ");
        System.out.println("Product Name: ");
        product1.ProductName = sc.nextLine();
        System.out.println("Product Price: ");
        product1.ProductPrice = sc.nextDouble();
        System.out.println("Product Quantity in stock: ");
        product1.ProductQuantity = sc.nextInt();

        System.out.println("Name: " + product1.ProductName + ", Price: " + product1.ProductPrice + ", Quantity: " + product1.ProductQuantity);

        sc.close();
    }
}