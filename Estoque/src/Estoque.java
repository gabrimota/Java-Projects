
// Importação de bibliotecas para a utilização do tipo Data
import java.time.LocalDate;

// Importação do formatador de datas
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

// Criação da classe estoque )
public class Estoque {

//    Atributos da Classe
    private String name;
    private int quantity;
    private Double price;
    Scanner sc = new Scanner(System.in);

// Aq estou utiliznado um tipo diferente (Data), para guardar a data de validade do produto
    LocalDate vality = LocalDate.now();

// Função exibir para mostrar os valores do atributos do nosso objeto
    public void Exibir(){
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.printf("Vality: %s\n", vality.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }

//    Constructor do object, he receptiom the informations of the produts
    public Estoque(String name, int quantity, double price, String ValidityString) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.vality = LocalDate.parse(ValidityString, formatter);
    }

// Getters ad Setters for atributs of objetc
    private void SetNome(String nome) {
        this.name = nome;
    }

    private String getNome() {
        return name;
    }

    private void SetQuantity(int quantidade) {
        this.quantity = quantidade;
    }

    private int GetQuantity() {
        return quantity;
    }

    private void SetPrice(Double preco) {
        this.price = preco;
    }

    private double GetPrice() {
        return price;
    }

    private void SetValidity(LocalDate data) {
        this.vality = data;
    }

    private LocalDate GetValidity() {
        return vality;
    }

//     Funções do objeto
    public Double TotalValorEstoque() {
         return this.quantity * this.price;

    }

    public void AddProdutoEstoque(String resp, int quantity) {
        System.out.println("You want to add new product in the stock? ");
          resp = sc.nextLine();
             if(resp.equals("S") || resp.equals("s")) {


        }
    }
    public void RemoveProductStock(){

    }
}