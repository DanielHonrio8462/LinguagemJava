package atividadecontabanco;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public void estaduAtual() {
        System.out.println("------------------");
        System.out.println(" Conta: "+ this.getNumConta());
        System.out.println(" Tipo: "+ this.getTipo());
        System.out.println(" Dono: "+ this.getDono());
        System.out.println(" Saldo: "+ this.getSaldo());
        System.out.println(" Status: "+ this.getStatus());
    }
    
    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "CC") {
            setSaldo(50);
        } else if (t == "CP") {
            setSaldo(150);
        }
        System.out.println(getDono() +" Sua Conta foi aberta com Sucesso!");
    }
    
    public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (getSaldo() < 0) {
            System.out.println("Conta esta em debito");
        } else if (getSaldo() == 0) {
            setStatus(false);
        }
    }
    
    public void depositar(float v) {
        if (getStatus() == true) {
            setSaldo(getSaldo() + v);
            System.out.println("Deposito realizado na conta de "+ getDono() +" de R$ "+ v);
        } else {
            System.out.println("Impossivel depositar");
        }
    }
    
    public void sacar(float v) {
        if (getStatus() == true) {
            if (getSaldo() >= v) {
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Impossivel Sacar "+ v);
            }
        } else {
            System.out.println("Conta Fechada");
        }
    }
    
    public void pagarMensal() {
        float v = 0;
        if (getTipo() == "CC") {
            v = 12;
        } else if (getTipo() == "CP") {
            v = 20;
        }
        if (getStatus() == true) {
            if (getSaldo() > v) {
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar");
        }
    }
    
    public void setNumConta(int n) {
        this.numConta = n;
    }
    
    public int getNumConta() {
        return numConta;
    }
    
    public void setTipo(String t) {
        this.tipo = t;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setDono(String d) {
        this.dono = d;
    }
    
    public String getDono() {
        return dono;
    }
    
    public void setSaldo(float s) {
        this.saldo = s;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public void setStatus(boolean st) {
        this.status = st;
    }
    
    public boolean getStatus() {
        return status;
    }
}
