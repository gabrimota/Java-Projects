import java.util.Random;

public class Luta   {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desa) {
        this.desafiante = desa;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador de) {
        this.desafiado = de;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rou) {
        this.rounds = rou;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean apro) {
        this.aprovada = apro;
    }



    //Métodos /funções

    public void MarcarLutar( Lutador l1  , Lutador l2 ){
                if( l1 != l2 && l1.getCategoria().equals(l2.getCategoria()) ){
                    setAprovada(true);
                    desafiado = l1;
                    desafiante = l2;
                    System.out.println("Luta entre" + l1.getNome() +" e "+ l2.getNome()+ " Aprovada!");
                } else
                    setAprovada(false);
                    desafiante = null;
                    desafiado = null;
                    System.out.println("Luta reprovada, Lutadores são de categorias diferentes ou oponente é o mesmo");
    }
    public void Lutar() {
        if(getAprovada()){
            new Random();
        }
    }
}
