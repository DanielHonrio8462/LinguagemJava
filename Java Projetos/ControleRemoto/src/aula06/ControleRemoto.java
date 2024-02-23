package aula06;
public class ControleRemoto implements Controlador{
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    // Get and Set
    private void setVolume(int v) {
        this.volume = v;
    }
    private int getVolume() {
        return volume;
    }
    
    private void setLigado(boolean l) {
        this.ligado = l;
    }
     boolean getLigado() {
        return ligado;
    }
    
    private void setTocando(boolean t) {
        this.tocando = t;
    }
    private boolean getTocando() {
        return tocando;
    }
    
    // Métodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Ligada");
        System.out.println("");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Desligando...");
        System.out.println("");
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println("----- MENU -----");
            System.out.println("Esta ligado? "+ this.getLigado());
            System.out.println("Esta tocando? "+ this.getTocando());
            System.out.print("Volume: "+ this.getVolume() +" ");
            for (int i = 0; i <= getVolume(); i+=10) {
                System.out.print("|");
            }
        } else {
            System.out.println("");
            System.out.println("Impossivel Abrir Menu. Desligada");
        }
        System.out.println("");
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechado Menu...");
        System.out.println("");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() == true) {
            this.setVolume(this.getVolume() + 5);
            System.out.println("Aumentar Volume: "+ this.getVolume());
            System.out.println("");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
            System.out.println("Diminuir Volume: "+ this.getVolume());
            System.out.println("");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() == true && this.getVolume() > 0) {
            this.setVolume(0);
            System.out.println("Mudo Ativado.");
            System.out.println("");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() == true && this.getVolume() == 0) {
            this.setVolume(50);
            System.out.println("Mudo Desativado");
            System.out.println("");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
            System.out.println("PLAY");
            System.out.println("");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
            System.out.println("Pause");
            System.out.println("");
        }
    }
}
