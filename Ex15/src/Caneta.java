
// ciração do objeto(classe) chamado caneta , caneta tem suas caracteristicas ( atributos) e seus metodos ( funções).
public class Caneta {
    public String marca;
   public String cor;
    private float ponta;
   private boolean tampada;
    protected int carga;

/* criamos metodos(funções) para utilizarmos no main.java, essas funções podem ter ações como mostrar o status
 da caneta ou destampar ela, rabiscar , escrever. */

    public  void status(){
      System.out.println("Marca: " + this.marca);
      System.out.println("Cor: " + this.cor);
      System.out.println("Ponta: " + this.ponta);
      System.out.println("Tampada: " + this.tampada);
      System.out.println("Carga: " + this.carga);

  }
  public void destampar() {
        this.tampada = false;
       System.out.println("Caneta destampada");
   }
    public void tampar(){
        this.tampada = true;
        System.out.println("Caneta tampada");
   }
    public void rabiscar(){
        if( this.tampada ) {
            System.out.println("Destampe primeiro");
        } else {
            System.out.println("rabiscando");
        }

    }
    public void ponta(){
        System.out.println("Ponta: " + this.ponta);
    }
}
