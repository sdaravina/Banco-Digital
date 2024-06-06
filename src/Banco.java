import java.util.List;

public class Banco extends Cliente {
     
    private List<Conta> contas; 


    public Banco(String nome) {
        super(nome);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}
