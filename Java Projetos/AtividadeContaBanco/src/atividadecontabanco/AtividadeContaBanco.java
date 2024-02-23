package atividadecontabanco;
public class AtividadeContaBanco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(1000);
        
        p1.estaduAtual();
        System.out.println("");
        p2.estaduAtual();
        
    }
    
}
