import org.w3c.dom.ls.LSOutput;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //     Getters / Setters

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
            this.peso = peso;
            setCategoria();
    }

    //    Métodos
    public String getCategoria() {
        return categoria;
    }

    private void setCategoria( ) {
        if( getPeso() <= 52.2 ) {
            this.categoria = "Inválido";
        } else if(getPeso() <= 70.3 ) {
            this.categoria = "Leve";
        } else if (getPeso() <= 83.9 ) {
            this.categoria = "Medio";
        } else if (getPeso() <= 120.3 ) {
            this.categoria = "Pesado";
        } else if (getPeso() >= 120.3 ) {
            this.categoria = "Exame médico";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //    Métodos(Funções)

    public void Construtor(String no, String na, int id, float al, float pe, String ca, int vi, int de , int em){
        nome = no;
        nacionalidade = na ;
        idade = id;
        altura = al;
//        Podemos fazer dessas 2 maneiras
        setPeso(pe);
        categoria = ca;
        vitorias = vi;
        derrotas = de;
        empates = em;
    }

    public void Apresentar(){
        System.out.println("Senhoras e Senhores!!! O lutador " + getNome() + " vai lutarr agora da categoria " + getCategoria());
        System.out.println("Ele vemmm do(a)" + getVitorias() );
        System.out.println("Com " + getDerrotas() + " derrotas" );
        System.out.println("Com " + getEmpates()+ " empates" );
        System.out.println("E Com " + getEmpates() + " vitórias" );

    }

    public void status(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Vitorias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());

    }

    public void ganharLuta(boolean LutaVitoria){
            setVitorias(getVitorias() + 1);
        System.out.println(getNome() + " venceuu a luta!");
    }

    public void perderLutar(boolean LutaVitoria){
            setDerrotas(getDerrotas() + 1);
            System.out.println(getNome() + " perdeuu a luta!");
    }

    public void empatarLuta(){
            setEmpates(getEmpates() + 1);
            System.out.println("De " + getNome() + " e " + getNome()  + " a luta foi umm empatee!");
    }
}
