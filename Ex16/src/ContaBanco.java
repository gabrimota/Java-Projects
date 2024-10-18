public class ContaBanco {
        public int numConta;
        protected String tipo;
        private String dono;
        private float saldo;
        private boolean status;

        public void StatusContaBanco() {
            System.out.println("Status da Conta");
            System.out.println("Conta: " + this.numConta);
            System.out.println("Tipo: " + this.tipo);
            System.out.println("Dono: " + this.dono);
            System.out.println("Saldo: " + this.saldo);
            System.out.println("Status: " + this.status);
        }
        public void abrirConta(String tipo) {
            this.tipo = tipo;
        }
        public void fecharConta() {

        }
        public void depositar(float valor) {
            this.saldo += valor;
        }
        public void sacar(float valor) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
            }
        }
}
