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


    public Lutador(String no, String na, int id, float al, float pe,  int vi, int de , int em){
        nome = no;
        nacionalidade = na ;
        idade = id;
        altura = al;
//        Podemos fazer dessas 2 maneiras
        setPeso(pe);
        vitorias = vi;
        derrotas = de;
        empates = em;
    }
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



    public void Apresentar(){
        System.out.println("Senhoras e Senhores!!! O lutador " + this.getNome() + " vai lutarr agora da categoria " + this.getCategoria());
        System.out.println("Ele vemmm do(a)" + this.getNacionalidade() );
        System.out.println("Pesa exatosss " +this.getPeso() + " Kilos");
        System.out.println("Com " + this.getDerrotas() + " derrotas" );
        System.out.println("Com " + this.getEmpates()+ " empates" );
        System.out.println("E Com " + this.getEmpates() + " vitórias" );

    }

    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());

    }

    public void ganharLuta(boolean LutaVitoria){
            this.setVitorias(this.getVitorias() + 1);
        System.out.println(getNome() + " venceuu a luta!");
    }

    public void perderLutar(boolean LutaVitoria){
            this.setDerrotas(this.getDerrotas() + 1);
            System.out.println(getNome() + " perdeuu a luta!");
    }

    public void empatarLuta(boolean LutaEmpate){
        this.setEmpates(this.getEmpates() + 1);
            System.out.println("De " + getNome() + " e " + getNome()  + " a luta foi umm empatee!");
    }
}
