public class ControleRemoto {
//    Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
//    Getters e Setters
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

}
