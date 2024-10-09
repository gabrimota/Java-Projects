public class Garrafa {
    String cor;
    String marca;
    String modelo;
    float tamanho;
    boolean aberta;
    boolean cheio;
    void abrir() {
        this.aberta = true;
    }

    void fechar() {
        this.aberta= true;
    }

    void encher(){
        this.cheio = true;
    }
    void esvaziar(){
        this.cheio = false;
    }
}
