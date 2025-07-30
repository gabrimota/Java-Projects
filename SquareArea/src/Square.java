
public class Square {
    double a, b, c;

    /*public Square(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }*/

    public double CalculateSquareArea(){
        double p =  (a+b+c) /2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }
}
