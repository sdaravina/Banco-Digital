public interface Sistema {

     void transferir(Double valor, Conta contaDestino);
     void depositar(Double valor);
     void sacar(Double valor);
     void imprimirExtrato(); 
     
} 