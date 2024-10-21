public class ContaBanco {
        public int numConta;
        protected String tipo;
        private String dono;
        private float saldo;
        private boolean status;
   // funçaõ criada para ver cada inf da conta
        public void StatusContaBanco() {
            System.out.println("Status da Conta");
            System.out.println("Conta: " + this.numConta);
            System.out.println("Tipo: " + this.tipo);
            System.out.println("Dono: " + this.dono);
            System.out.println("Saldo: " + this.saldo);
            System.out.println("Status: " + this.status);
        }
//    Sempre que finalizarmos uma conta vamos chamar essa função
    public void construtor(){
            saldo = 0;
            status = false;
    }
//    Abaixo temos tds setters e getters do nosso objeto
    public void setNumConta(int n) {
       numConta = n;
    }
    public int getNumConta(){
        return numConta;
    }
    public void setTipo(String t) {
            tipo = t;
    }
    public String getTipo(){
            return tipo;
    }
    public void setDono(String d){
            dono = d;
    }
    public String getDono(){
            return dono;
    }
    public void setSaldo(float s){
            saldo = s;
    }
    public float getSaldo(){
            return saldo;
    }
    public void setStatus(boolean s){
            status = s;
    }
    public boolean getStatus(){
            return status;
    }


/*
    Testando setters todos juntos
    public void conta(int nu, String t, String d, float s, boolean st) {
            this.numConta = nu;
            this.tipo = t;
            this.dono = d;
            this.saldo = s;
            this.status = st;
        }
*/

//         Função criada para abrir a conta do usuário
        public void abrirConta(String t) {
            setStatus(true);
            setTipo(t);
/*          Temos 2 tipos de conta(Corrente CC ou Poupança CP)
            A conta corrente começa com 50 mangos*/
            if( t.equals("CC")){
                this.saldo += 50;

//             A conta poupança começa com 150 mangos
            } else if( t.equals("CP")){
                this.saldo += 150;
            }
        }
//        Função craida para fechar conta do user
        public void fecharConta() {
            if (this.saldo > 0) {
                System.out.println("Ainda há saldo, favor retirar para fechar a conta!");
            } else if ( this.saldo < 0) {
                System.out.println("Ainda há dividas, favor pagar para fechar a conta!");
            } setStatus(false);

        }
//
        public void depositar(float valor) {
            // verifica se o staus é verdadeiro , se for ele adiciona o saldo
            if (getStatus()) {
                this.saldo += valor;
            }

        }

        public void sacar(float valor) {
            if (getStatus()) {
            if( this.saldo <  valor){
                System.out.println("Saldo insuficiente!");
            } else{
                this.saldo -= valor;
                System.out.println("Saque concluido com sucesso!");
            }
            }
        }

        public void  pagarMensal( int dia , float valorMensalCC , float valorMensalCP ){
            valorMensalCC = 30;
            valorMensalCP = 20;
            dia = 30;

            if( dia == 30 && this.tipo.equals("CC")){
                if(this.saldo < valorMensalCC){
                    System.out.println("Saldo Insuficiente! Você está devendo R$" + valorMensalCC );
                }
                this.saldo -= valorMensalCC;

            } else if( dia == 20 && this.tipo.equals("CP")){
                if(this.saldo < valorMensalCP){
                    System.out.println("Saldo Insuficiente! Você está devendo R$" + valorMensalCP );
                }  this.saldo -= valorMensalCP;
            }
        }


}
