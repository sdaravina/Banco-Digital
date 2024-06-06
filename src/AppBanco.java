public class AppBanco extends Banco {
    public AppBanco(String nome) {
        super(nome);
    }

    public static void main(String[] args) {

        Cliente joana = new Cliente(null);
        joana.setNome("Joana Silva");

        Conta cc = new ContaCorrente(joana);
        Conta poupanca = new ContaPoupanca(joana);


         cc.depositar((double) 100);

        cc.imprimirExtrato();

        cc.transferir(10, poupanca);

        poupanca.imprimirExtrato();

    }
}
