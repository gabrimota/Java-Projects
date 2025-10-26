import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Stock  product1 , product2, product3;

        product1 = new Stock();


        System.out.println("Enter Product Data, ");
        System.out.println("Product Name: ");
        product1.ProductName = sc.nextLine();
        System.out.println("Product Price: ");
        product1.ProductPrice = sc.nextDouble();
        System.out.println("Product Quantity in stock: ");
        product1.ProductQuantity = sc.nextInt();

        System.out.println("Product data: " + product1);

        System.out.println("Enter the number of the products you want to add in stock: ");
        int quantity = sc.nextInt();

        product1.AddProducts(quantity);

        System.out.println("Product data: " + product1);


        //        this command
        sc.close();
    }
}