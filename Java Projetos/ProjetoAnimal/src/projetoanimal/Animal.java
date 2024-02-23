package projetoanimal;
public abstract class Animal {
    // Atributos
    protected float peso;
    protected int idade;
    protected int menbro;
    
    // Métodos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMenbro() {
        return menbro;
    }

    public void setMenbro(int menbro) {
        this.menbro = menbro;
    }
    
    
}
