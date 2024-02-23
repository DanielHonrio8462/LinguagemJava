package herancapessoa;
public class Tecnico extends Aluno{
    private String registroProficional;
    
    public void praticar(){
        System.out.println("Estou praticando");
    }

    public String getRegistroProficional() {
        return registroProficional;
    }

    public void setRegistroProficional(String registroProficional) {
        this.registroProficional = registroProficional;
    }
    
    
}
