public class Main {
    public static void main(String[] args) {

        Garrafa garrafa = new Garrafa();
        garrafa.cor = "azul";
        garrafa.marca = "aboticario";
        garrafa.tamanho = 20;
        garrafa.cheio = false;
        garrafa.modelo = "plastico";

        garrafa.fechar();
        garrafa.encher();


    }
}