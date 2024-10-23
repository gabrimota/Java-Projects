public class Main {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.StatusContaBanco();
        conta1.abrirConta("CC");
        conta1.fecharConta();
        conta1.depositar(200);
        conta1.sacar(100);
        conta1.pagarMensal(30);

    }
}