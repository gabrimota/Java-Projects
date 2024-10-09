public class Garrafa {
    String cor;
    String marca;
    String modelo;
    float tamanho;
    boolean aberta;
    boolean cheio;

    void abrir() {
        if (this.aberta == true) {
            System.out.println("A garrafa já esta aberta");
        } else

            this.aberta = true;
        System.out.print("Abrindo!");
    }

    void fechar() {
        if (aberta == false) {
            System.out.println("A garrafa já esta fechada");
        } else
            this.aberta = false;
        System.out.print("Fechando!");
    }

    void encher() {
        if (aberta == false) {

            System.out.println("Abra a garrafa primeiro!");
        } else

            this.cheio = true;
        System.out.print("A garrafa foi enchida!!");

    }

    void esvaziar() {
        if (cheio == false) {
            System.out.println("Não é possivel esvaziar uma garrafa vazia!");
        } else {
            this.cheio = false;
            System.out.print("A garrafa foi esvaziada!!");
        }
    }
}