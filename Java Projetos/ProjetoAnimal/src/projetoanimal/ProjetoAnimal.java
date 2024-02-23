package projetoanimal;
public class ProjetoAnimal {
    public static void main(String[] args) {
        // Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguro can = new Canguro();
        Cachorro cach = new Cachorro();
        Cobra cob = new Cobra();
        GoldFish gold = new GoldFish();
        
        can.locomover();
        cach.locomover();
        cach.emitirSom();
    }
}
