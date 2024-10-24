//essa aqui seria a interface do controle (a parte vísivel dele onde temos os botões)
//uma interface não tem atributos, apenas metódos
//eu errei no nome(deveria ser controlador)
// todos métodos na interface devem ser públicos
// além de que eles são todos abstratos ( o metodo abstrato ele é previsto porém não implementado )
public abstract class Controle {

    public abstract void ligar();

    public abstract void desligar();

    public abstract void abrirMenu();

    public abstract void fecharMenu();

    public abstract void maisVolume();

    public abstract void menosVolume();

    public abstract void ligarMudo();

    public abstract void desligarMudo();

    public abstract void play();

    public abstract void pause();



}
