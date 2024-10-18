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
            this.status = true;
//            Temos 2 tipos de conta()
            this.tipo = tipo;
        }
        public void fecharConta() {
            this.status = false;
        }
        public void depositar(float valor) {
                this.saldo += valor;
        }
        public void sacar(float valor) {
            if( this.saldo <  valor){
                System.out.println("Saldo insuficiente!");
            } else{
                this.saldo -= valor;
                System.out.println("Saque concluido com sucesso!");
            }
        }
        public void  pagarMensal( int dia , float valorMensal ){
            valorMensal = 300;
            if( dia == 30){
                if(this.saldo > valorMensal){
                    System.out.printf("Saldo Insuficiente! Você está devendo %d", valorMensal);
                }
                this.saldo -= valorMensal;
            }
        }
}
