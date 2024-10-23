public class Main {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.setDono("Gabriel Bomfim Mota da Silva");
        conta1.setNumConta(1234);
        conta1.abrirConta("CC");
        conta1.StatusContaBanco();
        conta1.sacar(100);
    }
}