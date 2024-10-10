public class Main {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();
            caneta.cor = "Azul";
            caneta.marca = "Bic";
            caneta.carga = 47;


            caneta.tampar();

            caneta.status();
            caneta.rabiscar();
    }
}