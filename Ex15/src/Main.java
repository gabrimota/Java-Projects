public class Main {
    public static void main(String[] args) {

        Caneta caneta = new Caneta();
            caneta.cor = "Azul";
            caneta.marca = "Bic";
            caneta.ponta = 0.5f;
            caneta.carga = "47%";
            caneta.tampada = true;

            caneta.tampar();
             caneta.destampar();
            caneta.status();
            caneta.rabiscar();
    }
}