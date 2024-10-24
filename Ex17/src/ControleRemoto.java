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
    private void tocando(boolean tocando){
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
            this.GetTocando();
        }
    }

    @Override
    public void fecharMenu() {

    }

    @Override
    public void maisVolume() {

    }

    @Override
    public void menosVolume() {

    }

    @Override
    public void ligarMudo() {

    }

    @Override
    public void desligarMudo() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

}
