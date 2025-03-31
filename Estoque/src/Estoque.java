import java.time.LocalDate;

public class Estoque {
    private String nome;
    private int quantidade;
    private Double preco;
    LocalDate data = LocalDate.now();

    private void SetNome(String nome) {
        this.nome = nome;
    }
    private String getNome() {
        return nome;
    }
    private void SetQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    private int GetQuantidade(){
        return quantidade;
    }
    private void SetPreco(Double preco){
        this.preco = preco;
    }
    private double GetPreco(){
        return preco;
    }
    private void SetData(LocalDate data){
        this.data = data;
    }
    private LocalDate GetData(){
        return data;
    }

 public void TotalValorEstoque(){

 }


}
