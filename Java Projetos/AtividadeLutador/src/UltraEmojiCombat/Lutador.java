package UltraEmojiCombat;
public class Lutador {
    // ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria, derrotas, empates;
    // METODOS PÚBLICOS
    public void apresentar() {
        System.out.println("-------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador "+ this.getNome());
        System.out.println("Diretamente de "+ this.getNacionalidade());
        System.out.println("Com "+ this.getIdade() +" anos, pesando "+ getPeso() +"kg e "+ this.getAltura() +"m");
        System.out.println(this.getVitoria() +" Vitórias");
        System.out.println(this.getDerrotas() +" Derrotas");
        System.out.println(this.getEmpates() +" Empates");
    }
    public void status() {
        System.out.println(this.getNome() +" é um peso "+ this.getCategoria());
        System.out.println("Ganhou: "+ getVitoria() +" vezes");
        System.out.println("Perdeu: "+ getDerrotas() +" vezes");
        System.out.println("Empates: "+ getEmpates() +" vezes");
        System.out.println("");
    }
    public void ganharLuta() {
        this.setVitoria(this.getVitoria() + 1);
    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empates() {
        this.setEmpates(this.getEmpates() + 1);
    }
    // METODOS ESPECIAS 
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitoria = vi;
        this.derrotas = de;
        this.empates = em;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            categoria = "Inválido";
        } else if (this.getPeso() <= 70.3) {
            categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            categoria = "Pesado";
        } else {
            categoria = "Inválido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vi) {
        this.vitoria = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }
    
    
}
