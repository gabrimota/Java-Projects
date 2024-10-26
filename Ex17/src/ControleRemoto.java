public class ControleRemoto implements Controle {
//    Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
//    Getters e Setters
    public void Construtor(){
        volume = 25;
        ligado = false;
        tocando = false;
    }
    private void SetVolume(int volume) {
        this.volume = volume;
    }
    private int GetVolume() {
        return volume;
    }
    private void SetLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean GetLigado() {
        return ligado;
    }
    private void SetTocando(boolean tocando){
        this.tocando = tocando;
    }
    private boolean GetTocando(){
        return tocando;
    }
// metodos abstratos
// Override = sobescrever(este metodo existia no Controle.java porém não tinha nada nele, e agora estamos escrevendo por cima daquele outro código)
    @Override
    public void ligar() {
        this.SetLigado(true);
    }

    @Override
    public void desligar() {
        this.SetLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.GetLigado()){
            System.out.println("Está ligado: " + this.GetLigado());
            System.out.println("Está tocando: " + this.GetTocando());
            System.out.println("Volume: " + this.GetVolume());

            for(int i =0; i <= this.GetVolume(); i+=10){
                System.out.println("|");

            }
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.GetLigado()){
            this.SetVolume(this.GetVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if(this.GetLigado()){
            this.SetVolume(this.GetVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.GetLigado() && this.GetVolume() > 0){
            this.SetVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
            if(this.GetLigado() && this.GetVolume() == 0){
                this.SetVolume(50);
            }
    }

    @Override
    public void play() {
        if(this.GetLigado() && this.GetTocando()){
            this.SetTocando(true);
            System.out.println("Tocando...");
        }
    }

    @Override
    public void pause() {

    }

}
