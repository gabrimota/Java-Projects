// Importação de bibliotecas para a utilização do tipo Data
import java.time.LocalDate;
// Importação do formatador de datas
import java.time.format.DateTimeFormatter;

public class Estoque {
    private String nome;
    private int quantidade;
    private Double preco;
    LocalDate validade = LocalDate.now();

    public Estoque(String nome, int quantidade, double preco, String validadeString) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.validade = LocalDate.parse(validadeString, formatter);
    }


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

    public Double TotalValorEstoque() {


        return 0.0;
    }
}