public class Employee {
    public String name;
    public String sex;
    public int age;
    public double GrossSalary;
    public double tax;

    public double NetSalary(){
        return GrossSalary - tax;
    }

    public double IncreaseSalary(double percentage){
        return GrossSalary + (GrossSalary * (percentage/100));
    }

     public String toString(){
         return this.name + " $" + NetSalary() + " Age: " + age + " Sex: " + sex;
     }
}
