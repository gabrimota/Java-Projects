public class Garrafaa {
    public String cor;
    public String marca;
    public String modelo;
    public float tamanho;
    private boolean aberta;
    private boolean cheio;

   public void abrir() {
        if (this.aberta == true) {
            System.out.println("A garrafa já esta aberta");
        } else

            this.aberta = true;
        System.out.print("Abrindo!");
    }

    public void fechar() {
        if (aberta == false) {
            System.out.println("A garrafa já esta fechada");
        } else
            this.aberta = false;
        System.out.print("Fechando!");
    }

     public void encher() {
        if (aberta == false) {

            System.out.println("Abra a garrafa primeiro!");
        } else

            this.cheio = true;
        System.out.print("A garrafa foi enchida!!");

    }

     public void esvaziar() {
        if (cheio == false) {
            System.out.println("Não é possivel esvaziar uma garrafa vazia!");
        } else {
            this.cheio = false;
            System.out.print("A garrafa foi esvaziada!!");
        }
    }
}