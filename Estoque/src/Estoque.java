
// Importação de bibliotecas para a utilização do tipo Data
import java.time.LocalDate;

// Importação do formatador de datas
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

// Criação da classe estoque )
public class Estoque {

//    Atributos da Classe
    private String nome;
    private int quantidade;
    private Double preco;
    Scanner sc = new Scanner(System.in);

// Aq estou utiliznado um tipo diferente (Data), para guardar a data de validade do produto
    LocalDate validade = LocalDate.now();

// Função exibir para mostrar os valores do atributos do nosso objeto
    public void Exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preco: " + preco);
        System.out.printf("Validade: %s\n", validade.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }

//    Construtor do nosso objeto, ele que recebe as inf
    public Estoque(String nome, int quantidade, double preco, String validadeString) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.validade = LocalDate.parse(validadeString, formatter);
    }

// Getters e Setters de Cada Atribruto do objeto
    private void SetNome(String nome) {
        this.nome = nome;
    }

    private String getNome() {
        return nome;
    }

    private void SetQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    private int GetQuantidade() {
        return quantidade;
    }

    private void SetPreco(Double preco) {
        this.preco = preco;
    }

    private double GetPreco() {
        return preco;
    }

    private void SetValidade(LocalDate data) {
        this.validade = data;
    }

    private LocalDate GetValidade() {
        return validade;
    }

//     Funções do objeto
    public Double TotalValorEstoque() {
         return this.quantidade * this.preco;

    }

    public void AddProdutoEstoque(String resp) {
        System.out.println("Deseja adicionar um produtos no estoque? ");
          resp = sc.nextLine();
             if(resp.equals("S") || resp.equals("s")) {


        }
    }
}