public class Stock {

    private String ProductName;
    private double ProductPrice;
    private int ProductQuantity;

public Stock(String ProductName, double ProductPrice, int ProductQuantity){
    this.ProductName= ProductName;
    this.ProductPrice = ProductPrice;
    this.ProductQuantity = ProductQuantity;
}
public double TotalValueInStock(){
    double valueProducts = ProductPrice * ProductQuantity;
    System.out.println("Total Value in Stock: " + valueProducts);
    return valueProducts;
}
public void AddProducts(int Quantity){
    this.ProductQuantity += Quantity;
    System.out.println("New product add sucessfully.");
}

public void RemoveProducts(int Quantity){
    this.ProductQuantity -= Quantity;
}


}
