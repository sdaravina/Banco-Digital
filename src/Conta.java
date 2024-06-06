public abstract class Conta implements Sistema {
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente; 
    private double limite;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
    


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    
    public Cliente getCliente() {
        return cliente;
    }



    public double getLimite() {
        return limite;
    }

    @Override
    public void sacar(Double valor) {
        if(valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso");
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(Double valor) {
        saldo += valor; 
    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirExtrato() {}

    protected void ExtratoBancario() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %d", this.saldo));
    }



    public void transferir(int i, Conta contaDestino) {
    }

}
