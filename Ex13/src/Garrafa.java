public class Garrafa {
    String cor;
    String marca;
    String modelo;
    float tamanho;
    boolean aberta;
    boolean cheio;

    void abrir() {
        if ( aberta = true ){
            System.out.println("A garrafa já esta aberta");
        }

        this.aberta = true;
        System.out.printf("Abrindo!");
    }

    void fechar() {
        if (aberta = false ){
            System.out.printf("A garrafa já esta fechada");
        }
        this.aberta= false;
        System.out.printf("Fechando!");
    }

    void encher(){
        if (this.aberta = false){

            System.out.printf("Abra a garrafa primeiro!");
        }

        this.cheio = true;
        System.out.printf("A garrafa foi enchida!!");

    }
    void esvaziar(){
        if( cheio = false ){
            System.out.printf("Não é possivel esvaziar uma garrafa vazia!");
        }
        this.cheio = false;
        System.out.printf("A garrafa foi esvaziada!!");
    }
}
