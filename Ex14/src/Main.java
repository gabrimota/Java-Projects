public class Main {
    public static void main(String[] args) {

        Garrafaa garrafa = new Garrafaa();
        garrafa.cor = "azul";
        garrafa.marca = "aboticario";
        garrafa.tamanho = 20;
        //garrafa.cheio = false;
        garrafa.modelo = "plastico";


        garrafa.abrir();
        garrafa.encher();
        garrafa.esvaziar();



    }
}