public class Stock {

    public String ProductName;
    public double ProductPrice;
    public int ProductQuantity;

//    public Stock(String ProductName, double ProductPrice, int ProductQuantity){
//        this.ProductName= ProductName;
//        this.ProductPrice = ProductPrice;
//        this.ProductQuantity = ProductQuantity;
//    }


public double TotalValueInStock(){
      return ProductPrice * ProductQuantity;
}
    public void AddProducts(int Quantity){
    this.ProductQuantity += Quantity;
    System.out.println("New product add sucessfully.");
}

public void RemoveProducts(int Quantity){
    this.ProductQuantity -= Quantity;
}

public String toString(){

    return ProductName + ", $" + String.format("%.2f" , ProductPrice) +  ", " + ProductQuantity + " units in stock, " + "Total Value: "+ String.format("$%.2f", TotalValueInStock());

}

}
